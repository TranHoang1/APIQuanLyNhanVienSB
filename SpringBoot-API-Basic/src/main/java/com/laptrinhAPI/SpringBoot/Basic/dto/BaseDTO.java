package com.laptrinhAPI.SpringBoot.Basic.dto;

import java.util.Date;

public abstract class BaseDTO {
	private Long id;

	private Date createdDate;

	public void setId(Long id) {
		this.id = id;
	}

	private String createdBy;

	private Date modifiedDate;

	private String modifiedBy;

	public Long getId() {
		return id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
