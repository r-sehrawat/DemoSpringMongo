package com.mediplus.mediplus.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String userId;

	@Indexed(unique = true)
	private String email;
	
	private String userName;
	private String password;
	private List<String> favDoctor;
	private List<String> favHospital;
	private List<String> favClinic;
	private List<String> reviews;
	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", userName=" + userName + ", password=" + password
				+ ", favDoctor=" + favDoctor + ", favHospital=" + favHospital + ", favClinic=" + favClinic
				+ ", reviews=" + reviews + "]";
	}

	public List<String> getReviews() {
		return reviews;
	}

	public void setReviews(List<String> reviews) {
		this.reviews = reviews;
	}

	public User() {
		super();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getFavDoctor() {
		return favDoctor;
	}

	public void setFavDoctor(List<String> favDoctor) {
		this.favDoctor = favDoctor;
	}

	public List<String> getFavHospital() {
		return favHospital;
	}

	public void setFavHospital(List<String> favHospital) {
		this.favHospital = favHospital;
	}

	public List<String> getFavClinic() {
		return favClinic;
	}

	public void setFavClinic(List<String> favClinic) {
		this.favClinic = favClinic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((favClinic == null) ? 0 : favClinic.hashCode());
		result = prime * result + ((favDoctor == null) ? 0 : favDoctor.hashCode());
		result = prime * result + ((favHospital == null) ? 0 : favHospital.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (favClinic == null) {
			if (other.favClinic != null)
				return false;
		} else if (!favClinic.equals(other.favClinic))
			return false;
		if (favDoctor == null) {
			if (other.favDoctor != null)
				return false;
		} else if (!favDoctor.equals(other.favDoctor))
			return false;
		if (favHospital == null) {
			if (other.favHospital != null)
				return false;
		} else if (!favHospital.equals(other.favHospital))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}


}
