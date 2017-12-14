package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "interest")
public class InterestEntity {
	
	
	@Id
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = true)
	private Date date;
	
	

	public Long getId() {
		return id;
	}

	public double getInterest() {
		return interest;
	}

	public String getRegion() {
		return region;
	}

	@Column(nullable = true)
	private double interest;
	
	@Column(nullable = true)
	private String region;
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

}
