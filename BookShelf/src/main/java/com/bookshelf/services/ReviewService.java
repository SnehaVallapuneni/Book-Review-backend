package com.bookshelf.services;

import java.util.List;

import com.bookshelf.entities.ReviewEntity;

public interface ReviewService {

	// ReviewEntity saveReview(ReviewEntity review, String bookId) throws Exception;

	
	 ReviewEntity saveReview(ReviewEntity review);
	 String deleteReview(Long id);
	 List<ReviewEntity> getAllReviews();
	 ReviewEntity getReviewById(Long id);
	 ReviewEntity updateReview(ReviewEntity review);
	String deleteAll();
	List<ReviewEntity> getReviewsByBookId(String bookId);
}
