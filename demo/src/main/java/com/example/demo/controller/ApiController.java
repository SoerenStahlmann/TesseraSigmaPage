package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.InterestEntity;
import com.example.demo.entity.UnemploymentEntity;
import com.example.demo.service.FinancialDataService;

/**
 * A rest controller for the used api
 * 
 * @author stahlmann
 *
 */
@RestController
public class ApiController {

	@Autowired
	public FinancialDataService financialService;

	@RequestMapping("/api/interest")
	public List<InterestEntity> interestRegions(@RequestParam(value="region", defaultValue="Europa") String region) {
	        
		System.out.println(region);
		
	    //hier würdest du deinen service aufrufen
	    List<InterestEntity> beispiel = new LinkedList<InterestEntity>();
	    	
	    beispiel = financialService.getDataByRegion(region);
	    return beispiel;
	}
	
	@RequestMapping("api/unemp")
	public List<UnemploymentEntity> unemploymentData(){
		
		return financialService.getUnemployment();
		
	}
	
	@RequestMapping("api/unempDate")
	public Set<UnemploymentEntity> unemploymentDate(@RequestParam(value="start", defaultValue="") String start, @RequestParam(value="end", defaultValue="") String end, @RequestParam(value="region", defaultValue="germany") String region){
		
		
		Date startD = new Date();
		Date endD = new Date();
		
		
		
		/**
		 * convert Input of String to util.Date
		 * TODO: put in own function
		 */
		if(end.equals("")){
			endD = new Date();
			//start
			Calendar c = new GregorianCalendar(1948, 1, 1);
			startD = c.getTime();
		}
		//convert String to util.Date
		else{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try{
				
				startD = sdf.parse(start);
				endD = sdf.parse(end);
				
			}catch (java.text.ParseException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(endD);
		System.out.println(startD);
		
		return financialService.getUnemploymentBetween(startD, endD);
		
	}
	
	
	
	
	
	
	
}
