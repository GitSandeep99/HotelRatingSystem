package com.hotel.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.Repository.HotelRepository;
import com.hotel.entity.Hotel;
import com.hotel.exception.ResourceNotFoundException;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public List<Hotel> getListOfHotel() {
		List<Hotel> list = this.hotelRepository.findAll();
		return list;
	}

	@Override
	public Hotel createHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		Hotel createHotel = this.hotelRepository.save(hotel);
		return createHotel;
	}

	@Override
	public Hotel getHotelById(String hotelId) {

		Hotel hotelById = hotelRepository.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel not Found with id :" + hotelId));

		return hotelById;
	}

}
