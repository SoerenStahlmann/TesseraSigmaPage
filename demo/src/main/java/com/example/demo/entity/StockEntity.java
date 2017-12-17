package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "stockdata")
public class StockEntity {
	
	
	@Id
	@Column(nullable = true)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = true)
	private Date date;
	
	@Column(nullable = true)
	private double open;
	
	@Column(nullable = true)
	private double high;
	
	@Column(nullable = true)
	private double low;
	
	@Column(nullable = true)
	private double close;
	
	@Column(nullable = true)
	private double adjclose;
	
	@Column(nullable = true)
	private double volume;
	
	@Column(nullable = true)
	private String region;
	
	
	
	/**
	 * getter and setter
	 * @return
	 */
	
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public double getAdjclose() {
		return adjclose;
	}

	public void setAdjclose(double adjclose) {
		this.adjclose = adjclose;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
}
