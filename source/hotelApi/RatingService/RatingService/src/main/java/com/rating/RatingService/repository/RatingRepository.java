package com.rating.RatingService.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.rating.RatingService.entitiy.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {

	// custom finding method

	// getListOfRatingByUserId

	List<Rating> findByUserId(String userId);
	// getListOfRatingByHotelId

	List<Rating> findRatingByHotelId(String hotelId);

}
