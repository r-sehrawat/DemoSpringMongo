package com.mediplus.mediplus.model;

public class Review {


	private String reviewId;
	private String reviewDesc;
	private String reviewUserId;
	private Long createdAt;
	public String getReviewId() {
		return reviewId;
	}
	public Review() {
		super();
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewDesc() {
		return reviewDesc;
	}
	public void setReviewDesc(String reviewDesc) {
		this.reviewDesc = reviewDesc;
	}
	public String getReviewUserId() {
		return reviewUserId;
	}
	public void setReviewUserId(String reviewUserId) {
		this.reviewUserId = reviewUserId;
	}
	public Long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((reviewId == null) ? 0 : reviewId.hashCode());
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
		Review other = (Review) obj;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (reviewId == null) {
			if (other.reviewId != null)
				return false;
		} else if (!reviewId.equals(other.reviewId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", reviewDesc=" + reviewDesc + ", reviewUserId=" + reviewUserId
				+ ", createdAt=" + createdAt + "]";
	}
	
	
	

}
