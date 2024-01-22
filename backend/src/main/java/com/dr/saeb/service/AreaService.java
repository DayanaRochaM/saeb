package com.dr.saeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.saeb.model.AreaModel;
import com.dr.saeb.repository.AreaRepository;

@Service
public class AreaService {
	
	@Autowired
    AreaRepository areaRepository;

	public Iterable<AreaModel> findAll() {
		return areaRepository.findAll();
	}
}
