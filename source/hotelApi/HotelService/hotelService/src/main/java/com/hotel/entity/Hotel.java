package com.hotel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MICRO_HOTEL")
public class Hotel {

	@Id
	@Column(name = "HOTEL_ID")
	private String id;
	@Column(name = "HOTEL_NAME")
	private String name;
	@Column(name = "HOTEL_LOCATION")
	private String location;
	@Column(name = "HOTEL_RATING")
	private int starRating;
	@Column(name = "HOTEL_ABOOUT")
	private String about;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(String id, String name, String location, int starRating, String about) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.starRating = starRating;
		this.about = about;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", location=" + location + ", starRating=" + starRating
				+ ", about=" + about + "]";
	}

}
