package com.rating.RatingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.RatingService.entitiy.Rating;
import com.rating.RatingService.service.RatingServiceImple;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	private RatingServiceImple ratingService;

	@PostMapping("/create")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
		Rating create = ratingService.createrating(rating);
		return new ResponseEntity<Rating>(create, HttpStatus.CREATED);
	}

	@GetMapping("/list")
	public ResponseEntity<List<Rating>> getAllRating() {
		List<Rating> listOfRating = ratingService.getListOfRating();
		return new ResponseEntity<List<Rating>>(listOfRating, HttpStatus.OK);

	}

	@GetMapping("/{ratingId}")
	public ResponseEntity<Rating> ratingByid(@PathVariable("ratingId") String ratingId) {
		Rating ratingById = ratingService.ratingtById(ratingId);
		return new ResponseEntity<Rating>(ratingById, HttpStatus.OK);

	}

	@GetMapping("ratingByUser/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable("userId") String userId) {
		 List<Rating> listOfRatingByUserId = ratingService.getListOfRatingByUserId(userId);
		return new ResponseEntity <List<Rating>>(listOfRatingByUserId, HttpStatus.OK);

	}

	@GetMapping("hotel/{hotelId}")
	public List<Rating> getRatingByhotelId(@PathVariable("hotelId") String hotelId) {
		List<Rating> ratingByHotelId = ratingService.getListOfRatingByHotelId(hotelId);
		return ratingByHotelId;

	}

}
