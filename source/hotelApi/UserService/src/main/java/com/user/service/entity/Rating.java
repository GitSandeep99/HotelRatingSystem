package com.user.service.entity;

public class Rating {
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	
	private Hotel hotel;
	
	
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
	
	
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rating(String ratingId, String userId, String hotelId, int rating, String remark,Hotel hotel) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		
		this.hotel=hotel;
	}
	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating=" + rating
				+  ", hotel=" + hotel + "]";
	}
	
	
	
	
	
	
	
	
	

}
