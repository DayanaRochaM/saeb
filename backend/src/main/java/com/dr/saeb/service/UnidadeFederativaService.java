package com.dr.saeb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.saeb.model.UnidadeFederativaModel;
import com.dr.saeb.repository.UnidadeFederativaRepository;

@Service
public class UnidadeFederativaService {
	
	 @Autowired
	 UnidadeFederativaRepository unidadeFederativaRepository;
	 
	 List<UnidadeFederativaModel> findAllByRegiaoId(long idRegiao){
		 return unidadeFederativaRepository.findAllByRegiaoId(idRegiao);
	 }
}
