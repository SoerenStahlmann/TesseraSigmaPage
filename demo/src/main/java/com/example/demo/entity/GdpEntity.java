package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "gdp")
public class GdpEntity {

	
	@Id
	@Column(nullable = true)
	private Long id;
	
	

	@Temporal(TemporalType.DATE)
	@Column(nullable = true)
	private Date date;
	
	@Column(nullable = true)
	private Double gdp;
	
	@Column(nullable = true)
	private String region;
	
	
	
	/**
	 * setter and getter
	 * @return
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getGdp() {
		return gdp;
	}

	public void setGdp(Double gdp) {
		this.gdp = gdp;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
}
