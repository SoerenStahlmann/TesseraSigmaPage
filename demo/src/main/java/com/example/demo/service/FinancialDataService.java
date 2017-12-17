package com.example.demo.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.GdpEntity;
import com.example.demo.entity.InterestEntity;
import com.example.demo.entity.UnemploymentEntity;
import com.example.demo.repositories.GdpRepository;
import com.example.demo.repositories.InterestRepository;
import com.example.demo.repositories.UnemploymentRepository;

@Service
public class FinancialDataService {
	
	/**
	 * create all Repositories
	 */
	@Autowired
	public InterestRepository intRepository;
	@Autowired
	public UnemploymentRepository unempRepository;
	@Autowired
	public GdpRepository gdpRepository;
	

	
	
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

	public List<UnemploymentEntity> getUnemploymentBetween(Date start, Date end){
		
		return unempRepository.findAllByDateBetween(start, end);
		
	}
	
	public List<GdpEntity> getGdp(){
		
		return gdpRepository.findAll();
		
	}
	
	
	
	
	
	
	
	

}
