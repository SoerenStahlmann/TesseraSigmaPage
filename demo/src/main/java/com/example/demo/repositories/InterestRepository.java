package com.example.demo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.InterestEntity;

public interface InterestRepository extends CrudRepository<InterestEntity, Date> {

	
	public List<InterestEntity> findAll();
	public List<InterestEntity> findByRegion(String region);
	
	
}
