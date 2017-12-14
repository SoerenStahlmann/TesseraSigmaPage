package com.example.demo.repositories;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.UnemploymentEntity;

public interface UnemploymentRepository extends CrudRepository<UnemploymentEntity, Date>{
	
	public List<UnemploymentEntity> findAll();
	public Set<UnemploymentEntity> findAllByDateBetween(Date start, Date end);

}
