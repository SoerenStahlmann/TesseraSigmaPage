package com.example.demo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.StockEntity;

public interface StockRepository extends CrudRepository<StockEntity, Long>{

	
	
	public static final String TEST = "SELECT date, close FROM stockdata where id >= ? and id <= ?";
	
	@Query(value = TEST, nativeQuery = true)
	public List<StockEntity> dateTest(Long start, Long end);
	
	public List<StockEntity> findAllByDateBetween(Date start, Date end);
	
	
}
