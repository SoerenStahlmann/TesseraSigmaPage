package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "unemployment")
public class UnemploymentEntity {

	
	@Id
	@Column(nullable = true)
	private Long id;
	
	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date date;

	

	@Column(nullable = true)
	private Double unempl;
	
	@Column(nullable = true)
	private String region;
	
	
	/**
	 * setter and getter
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getUnempl() {
		return unempl;
	}

	public void setUnempl(Double unempl) {
		this.unempl = unempl;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
