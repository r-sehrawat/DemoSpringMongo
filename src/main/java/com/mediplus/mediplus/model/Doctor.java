package com.mediplus.mediplus.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Doctor {

	@Id
	private String dId;

	@Indexed
	private String dname;

	public Doctor() {
		super();
	}

	@Indexed(unique = true)
	private String email;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	private String hId;
	private String cId;
	private Meta meta;

	public String getdId() {
		return dId;
	}

	public void setdId(String dId) {
		this.dId = dId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String gethId() {
		return hId;
	}

	public void sethId(String hId) {
		this.hId = hId;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public Meta getDoctorMeta() {
		return meta;
	}

	public void setDoctorMeta(Meta doctorMeta) {
		this.meta = doctorMeta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dId == null) ? 0 : dId.hashCode());
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
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
		Doctor other = (Doctor) obj;
		if (dId == null) {
			if (other.dId != null)
				return false;
		} else if (!dId.equals(other.dId))
			return false;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [dId=" + dId + ", dname=" + dname + ", email=" + email + ", password=" + password + ", hId="
				+ hId + ", cId=" + cId + ", meta=" + meta + "]";
	}

}
