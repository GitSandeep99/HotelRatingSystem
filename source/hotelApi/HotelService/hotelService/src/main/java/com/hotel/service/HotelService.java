package com.hotel.service;

import java.util.List;

import com.hotel.entity.Hotel;

public interface HotelService {
	public List<Hotel> getListOfHotel() ;
	public Hotel createHotel(Hotel hotel) ;
	public Hotel getHotelById(String hotelId);

}
