package com.rating.RatingService.service;

import java.util.List;

import com.rating.RatingService.entitiy.Rating;

public interface RatingService {
	// create new Rating

	public Rating createrating(Rating rating);

	// get ALl Rating
	public List<Rating> getListOfRating();

	// get all rating by userId
	public List<Rating> getListOfRatingByUserId(String userId);

	// get ALl Rating by hotelId
	public List<Rating> getListOfRatingByHotelId(String hotalId);
	// get rating by ratingId

	public Rating ratingtById(String ratingId);

}
