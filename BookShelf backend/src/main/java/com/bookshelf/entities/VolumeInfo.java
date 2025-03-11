package com.bookshelf.entities;
import java.util.*;

public class VolumeInfo {
	
	    private String title;
	    private String subtitle;
	    private String[] authors;
	    private String publisher;
	    private String publishDate;
	    private String description;
	    private int averageRating;
	    private int ratingsCount;
	    private ImageLinks imageLinks;

	    // Getters and Setters

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getSubtitle() {
	        return subtitle;
	    }

	    public void setSubtitle(String subtitle) {
	        this.subtitle = subtitle;
	    }

	    public String[] getAuthors() {
	        return authors;
	    }

	    public void setAuthors(String[] authors) {
	        this.authors = authors;
	    }

	    public String getPublisher() {
	        return publisher;
	    }

	    public void setPublisher(String publisher) {
	        this.publisher = publisher;
	    }

	    public String getPublishDate() {
	        return publishDate;
	    }

	    public void setPublishDate(String publishDate) {
	        this.publishDate = publishDate;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public int getAverageRating() {
	        return averageRating;
	    }

	    public void setAverageRating(int averageRating) {
	        this.averageRating = averageRating;
	    }

	    public int getRatingsCount() {
	        return ratingsCount;
	    }

	    public void setRatingsCount(int ratingsCount) {
	        this.ratingsCount = ratingsCount;
	    }

	    public ImageLinks getImageLinks() {
	        return imageLinks;
	    }

	    public void setImageLinks(ImageLinks imageLinks) {
	        this.imageLinks = imageLinks;
	    }

	    @Override
	    public String toString() {
	        return "VolumeInfo{" +
	                "title='" + title + '\'' +
	                ", subtitle='" + subtitle + '\'' +
	                ", authors=" + Arrays.toString(authors) +
	                ", publisher='" + publisher + '\'' +
	                ", publishDate='" + publishDate + '\'' +
	                ", description='" + description + '\'' +
	                ", averageRating=" + averageRating +
	                ", ratingsCount=" + ratingsCount +
	                ", imageLinks=" + imageLinks +
	                '}';
	    }

	    // Inner class for ImageLinks
	    public static class ImageLinks {
	        private String thumbnail;
	        private String smallThumbnail;

	        // Getters and Setters

	        public String getThumbnail() {
	            return thumbnail;
	        }

	        public void setThumbnail(String thumbnail) {
	            this.thumbnail = thumbnail;
	        }

	        public String getSmallThumbnail() {
	            return smallThumbnail;
	        }

	        public void setSmallThumbnail(String smallThumbnail) {
	            this.smallThumbnail = smallThumbnail;
	        }

	        @Override
	        public String toString() {
	            return "ImageLinks{" +
	                    "thumbnail='" + thumbnail + '\'' +
	                    ", smallThumbnail='" + smallThumbnail + '\'' +
	                    '}';
	        }
	    }

}
