package com.dr.saeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.saeb.model.LocalizacaoModel;
import com.dr.saeb.repository.LocalizacaoRepository;

@Service
public class LocalizacaoService {
	@Autowired
    LocalizacaoRepository localizacaoRepository;

	public Iterable<LocalizacaoModel> findAll() {
		return localizacaoRepository.findAll();
	}
	
}
