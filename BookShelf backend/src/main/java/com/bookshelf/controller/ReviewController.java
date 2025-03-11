package com.bookshelf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookshelf.entities.ReviewEntity;
import com.bookshelf.services.ReviewService;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("/api/reviews")
public class ReviewController {

	@Autowired
	private ReviewService rs;
	
	
/*	@PostMapping("/{id}")
	ResponseEntity<?> createReview(@RequestBody ReviewEntity review,@PathVariable String id) {
	    try {
	        ReviewEntity newReview = rs.saveReview(review);
	        return ResponseEntity.status(HttpStatus.CREATED).body(newReview);
	    } catch (Exception e) {
	        System.out.println(e.getMessage()); // Log the error message for debugging
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }
	}*/
	@PostMapping("/{bookId}")
	public ResponseEntity<?> createReview(@RequestBody ReviewEntity review, @PathVariable String bookId) {
	    try {
	        // Set the bookId in the review entity
	        review.setBookId(bookId);
	        ReviewEntity newReview = rs.saveReview(review);
	        return ResponseEntity.status(HttpStatus.CREATED).body(newReview);
	    } catch (Exception e) {
	        System.out.println(e.getMessage()); // Log the error message for debugging
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }
	}
	
	@GetMapping()
	public ResponseEntity<List<ReviewEntity>> getAllReviews(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(rs.getAllReviews());
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		}
	
	@GetMapping("/reviews/{id}")
	public ResponseEntity<ReviewEntity> getReviewById(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(rs.getReviewById(id));
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/{bookId}")
	public ResponseEntity<List<ReviewEntity>> getReviewsByBookId(@PathVariable String bookId) {
	    try {
	        List<ReviewEntity> reviews = rs.getReviewsByBookId(bookId);
	        if (reviews.isEmpty()) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(reviews);
	        }
	        return ResponseEntity.status(HttpStatus.OK).body(reviews);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }
	}

	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteReview(@PathVariable Long id) {
		try {
			rs.deleteReview(id);
			return ResponseEntity.ok().build();
		} catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@DeleteMapping
	public ResponseEntity<String> deleteReview(){
		try {
			String status=rs.deleteAll();
			return new ResponseEntity<>(status,HttpStatus.OK);
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<ReviewEntity> editReview(@RequestBody ReviewEntity review){
			try {
				ReviewEntity updatedReview=rs.updateReview(review);
				return  ResponseEntity.status(HttpStatus.CREATED).body(updatedReview);
			}
			catch(Exception e) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
	}
}
