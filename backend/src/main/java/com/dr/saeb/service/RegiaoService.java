package com.dr.saeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.saeb.model.RegiaoModel;
import com.dr.saeb.repository.RegiaoRepository;

@Service
public class RegiaoService {
	
	@Autowired
    RegiaoRepository regiaoRepository; 

	public Iterable<RegiaoModel> findAll() { 
		return regiaoRepository.findAll();
	}
	
}
