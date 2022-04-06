package com.springbootexample.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
 	
	@Column(name="createdDate")
	@CreatedDate
	private Date createdDate;
	
	@Column(name="createdBy")
	@CreatedBy
	private String createdBy;
	
	@Column(name="modifiedDate")
	@LastModifiedDate
	private Date modifiedDate;
	
	@Column(name="modifiedBy")
	@LastModifiedBy
	private String modifiedBy;

	public Date getCreatedDate() {
		return createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}


	public Date getModifiedDate() {
		return modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}
	
}
