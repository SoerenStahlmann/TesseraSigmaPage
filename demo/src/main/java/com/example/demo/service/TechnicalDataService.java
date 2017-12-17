package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StockEntity;
import com.example.demo.repositories.StockRepository;

@Service
public class TechnicalDataService {

	
	@Autowired
	StockRepository stockRepository;
	
	
	
	/**
	 * Get the closing Price of the index between two Date points
	 * @return
	 */
	public List<StockEntity> getClose(Date start, Date end){
		
		
		
		
		return stockRepository.findAllByDateBetween(start, end);
	}
	
	
	
	
}
