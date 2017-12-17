package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.GdpEntity;

public interface GdpRepository extends CrudRepository<GdpEntity, Long>{

	
	public List<GdpEntity> findAll();
	
}
