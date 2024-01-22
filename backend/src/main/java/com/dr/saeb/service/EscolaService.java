package com.dr.saeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.saeb.model.EscolaModel;
import com.dr.saeb.repository.EscolaRepository;

@Service
public class EscolaService {
	
	@Autowired
    EscolaRepository escolaRepository;

	public List<EscolaModel> findAllByMuncipioModelId(long idMunicipio) { 
		return escolaRepository.findAllByMunicipioModelId(idMunicipio);
	} 

}
