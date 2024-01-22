package com.dr.saeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.saeb.model.DependenciaAdministrativaModel;
import com.dr.saeb.repository.DependenciaAdministrativaRepository;

@Service
public class DependenciaAdministrativaService {
	
    @Autowired
    DependenciaAdministrativaRepository dependenciaAdministrativaRepository;

	public Iterable<DependenciaAdministrativaModel> findAll() { 
		return dependenciaAdministrativaRepository.findAll();
	}
    
}
