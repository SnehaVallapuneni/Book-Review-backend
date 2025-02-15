package com.bookshelf.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Entity
@Table(name="reviews")
public class ReviewEntity {

	public ReviewEntity() {
		
	}
	public ReviewEntity(long id, String reviewerName, String comment, int rating,String bookId) {
		super();
		this.id = id;
		this.reviewerName = reviewerName;
		this.comment = comment;
		this.rating = rating;
		this.bookId=bookId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReviewerName() {
		return reviewerName;
	}
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    private String reviewerName;
    private String comment;
    private int rating;
    private String bookId;
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
}
