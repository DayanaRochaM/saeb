package com.dr.saeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.saeb.repository.ClassificacaoRepository;

@Service
public class ClassificacaoService {
	@Autowired
    ClassificacaoRepository classificacaoRepository; 
	
}
