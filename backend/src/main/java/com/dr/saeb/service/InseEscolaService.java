package com.dr.saeb.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.saeb.model.InseEscolaModel;
import com.dr.saeb.repository.InseEscolaRepository;

@Service
public class InseEscolaService {
	
	@Autowired
    InseEscolaRepository inseEscolaRepository;
	
	public List<InseEscolaModel> findAllByEscolaModelId(long idEscola, int anoInicio) {
		return inseEscolaRepository.findAllByEscolaModelIdAndAnoInicio(idEscola, anoInicio);
	}
}
