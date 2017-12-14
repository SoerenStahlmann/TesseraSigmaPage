package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.InterestEntity;
import com.example.demo.entity.UnemploymentEntity;
import com.example.demo.repositories.InterestRepository;
import com.example.demo.repositories.UnemploymentRepository;

@Service
public class FinancialDataService {
	
	@Autowired
	public InterestRepository intRepository;
	@Autowired
	public UnemploymentRepository unempRepository;

	
	
	/**
	 * get the Interest Data from a certain region over the whole Timeframe
	 * 
	 * @param region
	 * @return List<InternetEntity>
	 */
	public List<InterestEntity> getDataByRegion(String region){
		//returns some chart data TODO
		return intRepository.findByRegion(region);
	}
	
	/**
	 * get all unemployment Data over the whole Timeframe
	 * 
	 * @return List<UnemploymentEntity>
	 */
	public List<UnemploymentEntity> getUnemployment(){
		
		return unempRepository.findAll();
	}
	
	
	
	public Set<UnemploymentEntity> getUnemploymentBetween(Date start, Date end){
		
		return unempRepository.findAllByDateBetween(start, end);
		
	}
	
	
	
	
	
	
	
	

}
