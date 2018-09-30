package com.mediplus.mediplus.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hospital {
	
	public Hospital() {
		super();
	}
	@Id
	private String hId;
	
	@Indexed
	private String hName;
	
	@Indexed(unique = true)
	private String emailId;
	
	private String password;
	
	
	public String gethId() {
		return hId;
	}
	public void sethId(String hId) {
		this.hId = hId;
	}
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private Meta meta;
	public String getdId() {
		return hId;
	}
	public void setdId(String cId) {
		this.hId = cId;
	}
	public String getHname() {
		return hName;
	}
	public void setHname(String hName) {
		this.hName = hName;
	}
	
	
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hId == null) ? 0 : hId.hashCode());
		result = prime * result + ((hName == null) ? 0 : hName.hashCode());
		result = prime * result + ((meta == null) ? 0 : meta.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Hospital [hId=" + hId + ", hName=" + hName + ", emailId=" + emailId + ", password=" + password
				+ ", meta=" + meta + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		if (hId == null) {
			if (other.hId != null)
				return false;
		} else if (!hId.equals(other.hId))
			return false;
		if (hName == null) {
			if (other.hName != null)
				return false;
		} else if (!hName.equals(other.hName))
			return false;
		if (meta == null) {
			if (other.meta != null)
				return false;
		} else if (!meta.equals(other.meta))
			return false;
		return true;
	}
	
	
	
}
