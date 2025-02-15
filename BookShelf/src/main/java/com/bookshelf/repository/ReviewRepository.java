package com.bookshelf.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookshelf.entities.ReviewEntity;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity,Long>{

	//List<ReviewEntity> findByBookId(Long bookId);
	ReviewEntity getReviewById(Long Id);
	List<ReviewEntity> findByBookId(String bookId);
}

