package com.dr.saeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dr.saeb.model.vo.FilterVO;

import reactor.core.publisher.Mono; 

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class GenericService {

    @Autowired
    RegiaoService regiaoService;
    @Autowired
    AreaService areaService;
    @Autowired
    DependenciaAdministrativaService dependenciaAdministrativaService;
    @Autowired
    LocalizacaoService localizacaoService;
    @Autowired
    ClassificacaoService classificacaoService;
    @Autowired
    UnidadeFederativaService unidadeFederativaService;
    @Autowired
    MunicipioService municipioService;
    @Autowired
    EscolaService escolaService;
    @Autowired
    InseEscolaService inseEscolaService; 

    public Mono<Map<String, Object>> getInitialState(){
    	Map<String, Object> parameters = new HashMap<>();
    	
		parameters.put("listaRegioes", regiaoService.findAll());
		parameters.put("areas", areaService.findAll());
		parameters.put("dependenciasAdministrativas", dependenciaAdministrativaService.findAll());
		parameters.put("localizacoes", localizacaoService.findAll());
		
		return Mono.just(parameters);
    }

	public Mono<Map<String, Object>> findInseEscolaByFilter(FilterVO filterVO) {
		
		Map<String, Object> parameters = new HashMap<>();
		
		Long  idRegiao = filterVO.getIdRegiao();
		Long  idUF = filterVO.getIdUF();
		Long  idMunicipio = filterVO.getIdMunicipio();
		Long  idEscola = filterVO.getIdEscola();
		  
		if(Objects.nonNull(idEscola)) {
			parameters.put("listaInseEscolas", inseEscolaService.findAllByEscolaModelId(idEscola, 2021));
		}
		else if(Objects.nonNull(idMunicipio)) {
			parameters.put("listaEscolas", escolaService.findAllByMuncipioModelId(idMunicipio));
		}
		else if(Objects.nonNull(idUF)) {
			parameters.put("listaMunicipios", municipioService.findAllByUnidadeFederativaModelId(idUF));
		} 
		else if(Objects.nonNull(idRegiao)) {	 
			parameters.put("listaUFs", unidadeFederativaService.findAllByRegiaoId(idRegiao));  
		}
		
		return Mono.just(parameters);
	}

}
