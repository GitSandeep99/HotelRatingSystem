package com.rating.RatingService.entitiy;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("USER_RATING")
public class Rating {

	@Id
	private String ratingId;
	
	private String userId;
	
	private String hotelId;
	
	private int rating;
	
	private Hotel hotel;
	
	private String feedback;

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Rating(String ratingId, String userId, String hotelId, int rating, String feedback, Hotel hotel) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.hotel = hotel;
		this.feedback = feedback;
	}

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating=" + rating
				+ ", feedback=" + feedback + "]";
	}

}
