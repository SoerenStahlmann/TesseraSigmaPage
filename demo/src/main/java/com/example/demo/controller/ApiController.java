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

import com.example.demo.entity.GdpEntity;
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
		
		Date[] dArray = new Date[2];

		/**
		 * convert Input of String to util.Date
		 * TODO: put in own function
		 */
		if(end.equals("")){
			dArray[1] = new Date();
			//start
			Calendar c = new GregorianCalendar(1948, 1, 1);
			dArray[0] = c.getTime();
		}
		//convert String to util.Date
		else{
			dArray = this.parseDate(start, end);
		}
		
		System.out.println(dArray[0]);
		System.out.println(dArray[1]);
		
		return financialService.getUnemploymentBetween(dArray[0], dArray[1]);
		
	}
	
	
	@RequestMapping("api/gdp")
	public List<GdpEntity> gdpAll(){
		
		return financialService.getGdp();
		
	}
	
	
	
	
	
	/**
	 * 
	 * @param start
	 * @param end
	 * @return dateArray with dateArray[0] being the startDate and dateArray[1] being the endDate as a java.util.date object
	 */
	public Date[] parseDate(String start, String end){
		
		//init dateArray
		Date[] dateArray = new Date[2];
		
		
		//parsing from String to Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try{
			
			dateArray[0] = sdf.parse(start);
			dateArray[1] = sdf.parse(end);
			
		}catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		
		
		
		return dateArray;
		
		
	}
	
	
	
	
	
	
}
