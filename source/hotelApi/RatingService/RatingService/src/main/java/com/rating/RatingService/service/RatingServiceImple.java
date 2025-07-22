package com.rating.RatingService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.RatingService.entitiy.Rating;
import com.rating.RatingService.exception.RatingNotFoundException;
import com.rating.RatingService.repository.RatingRepository;

@Service
public class RatingServiceImple implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating createrating(Rating rating) {
		Rating createRating = ratingRepository.save(rating);
		return createRating;
	}

	@Override
	public List<Rating> getListOfRating() {

		List<Rating> list = ratingRepository.findAll();
		return list;
	}

	@Override
	public Rating ratingtById(String ratingId) {
		Rating ratingByid = ratingRepository.findById(ratingId)
				.orElseThrow(() -> new RatingNotFoundException("Rating not Found with id :" + ratingId));

		return ratingByid;
	}

	@Override
	public List<Rating> getListOfRatingByUserId(String userId) {
		List<Rating> findByUserId = ratingRepository.findByUserId(userId);
		return findByUserId;
	}

	@Override
	public List<Rating> getListOfRatingByHotelId(String hotalId) {

		List<Rating> findRatingByHotelId = ratingRepository.findRatingByHotelId(hotalId);
		return findRatingByHotelId;
	}

}
