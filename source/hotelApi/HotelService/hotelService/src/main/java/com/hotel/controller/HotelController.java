package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.Hotel;
import com.hotel.service.HotelService;



@RequestMapping("/hotel")
@RestController
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@PostMapping("/create")
	public Hotel createHotel(@RequestBody Hotel hotel) {

		Hotel createHotel = this.hotelService.createHotel(hotel);
		return createHotel;

	}

	@GetMapping("/list")
	public List<Hotel> listofHotel() {

		List<Hotel> list = this.hotelService.getListOfHotel();
		return list;

	}

	@GetMapping("/{hotelId}")
	public Hotel getById(@PathVariable("hotelId") String hotelId) {

		Hotel hotelById = this.hotelService.getHotelById(hotelId);
		return hotelById;

	}

}
