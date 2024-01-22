package com.dr.saeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.saeb.model.MunicipioModel;
import com.dr.saeb.repository.MunicipioRepository;

@Service
public class MunicipioService {
	@Autowired
    MunicipioRepository municipioRepository;
	
	List<MunicipioModel> findAllByUnidadeFederativaModelId(long idUF){
		return municipioRepository.findAllByUnidadeFederativaModelId(idUF);
	}
 
}
