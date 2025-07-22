package com.user.service.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Table(name = "Micro_User")
@Entity
public class User {

	@Id
	@Column(name = "USER_ID")
	private String id;
	@Column(name = "USER_NAME")
	private String name;
	@Column(name = "USER_EMAIL")
	private String email;
	@Column(name = "USER_ABOUT")
	private String about;

	@Transient
	private List<Rating> rating;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}

	public User(String id, String name, String email, String about, List<Rating> rating) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.about = about;
		this.rating = rating;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + name + ", email=" + email + ", about=" + about + ", rating=" + rating
				+ "]";
	}

}
