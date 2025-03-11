package com.bookshelf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshelf.entities.ReviewEntity;
import com.bookshelf.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	private ReviewRepository rr;
	
	
	public ReviewEntity saveReview(ReviewEntity review) {
        return rr.save(review);
    }
	
	
	/*public ReviewEntity saveReview(ReviewEntity review, String bookId) throws Exception {
        // Find the book by bookId
        BookEntity book = br.findById(bookId)
            .orElseThrow(() -> new Exception("Book not found"));

        review.setBook(book);
        return rr.save(review);
    }*/
	
	public void deleteReview(Long id) {
		if (!rr.existsById(id)) {
			throw new IllegalArgumentException("Review not found with id: " + id);
		}
		rr.deleteById(id);
	}
	
	public List<ReviewEntity> getAllReviews() {
        return rr.findAll();
    }

	@Override
	public ReviewEntity getReviewById(Long id) {
		if(rr.existsById(id)) {
			return rr.getReviewById(id);
		}
		return null;
	}
	public String deleteAll() {
		rr.deleteAll();
		return "Deleted Successfully";
	}
	
	public ReviewEntity updateReview(ReviewEntity review) {
		Long reviewId = review.getId();
	    if (reviewId == null || !rr.existsById(reviewId)) {
	       
	        throw new IllegalArgumentException("Invalid post ID: " + reviewId);
	    }

	    ReviewEntity existingReview = rr.findById(reviewId).orElseThrow(() -> 
	        new IllegalStateException("Post not found for ID: " + reviewId));
	    existingReview.setComment(review.getComment());
	    existingReview.setReviewerName(review.getReviewerName());
	    existingReview.setRating(review.getRating());
	 
	    return rr.save(existingReview);
	}

	@Override
	public List<ReviewEntity> getReviewsByBookId(String bookId) {
		    return rr.findByBookId(bookId);
		}

	
	
}
