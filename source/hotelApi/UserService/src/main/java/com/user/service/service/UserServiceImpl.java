package com.user.service.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.service.entity.Hotel;
import com.user.service.entity.Rating;
import com.user.service.entity.User;
import com.user.service.exception.UserNotFoundException;
import com.user.service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private Logger LOGGER = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<User> getUserList() {
		List<User> list = this.userRepository.findAll();
		
		List<User> ratedList = list.stream().map(user -> {
			Rating[] ratingByUser = restTemplate.getForObject("http://Rating-Service/rating/ratingByUser/" + user.getId(),
					Rating[].class);
			 
			
			List<Rating> ratingList = Arrays.stream(ratingByUser).map(rating -> {
				// Fetch hotel by hotelI
				ResponseEntity<Hotel> response = restTemplate
						.getForEntity("http://Hotel-Service/hotel/" + rating.getHotelId(), Hotel.class);
				Hotel hotel = response.getBody();

				// set hotel details to the rating
				rating.setHotel(hotel);

				return rating;
			}).collect(Collectors.toList());
			 
			user.setRating(ratingList);

			return user;
		}).collect(Collectors.toList());
		
		
		return ratedList;

	}

	@Override
	public User createUser(User user) {
		String userId = UUID.randomUUID().toString();
		user.setId(userId);
		User createuser = this.userRepository.save(user);
		return createuser;
	}

	@Override
	public User getUserById(String userId) {

		User user = this.userRepository.findById(userId)
				.orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));

		// Fetch ratings for this user
		Rating[] ratingByUser = restTemplate.getForObject("http://Rating-Service/rating/ratingByUser/" + user.getId(),
				Rating[].class);

		List<Rating> ratingList = Arrays.stream(ratingByUser).map(rating -> {
			// Fetch hotel by hotelI
			ResponseEntity<Hotel> response = restTemplate
					.getForEntity("http://Hotel-Service/hotel/" + rating.getHotelId(), Hotel.class);
			Hotel hotel = response.getBody();

			// set hotel details to the rating
			rating.setHotel(hotel);

			return rating;
		}).collect(Collectors.toList());

		user.setRating(ratingList);
		return user;
	}

}
