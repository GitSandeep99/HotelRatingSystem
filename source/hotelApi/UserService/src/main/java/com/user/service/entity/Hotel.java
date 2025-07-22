package com.user.service.entity;

public class Hotel {

	private String id;

	private String name;

	private String location;

	private int starRating;

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
