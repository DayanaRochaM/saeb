package com.dr.saeb.repository;

import java.util.List; 

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dr.saeb.model.InseEscolaModel;

@Repository
public interface InseEscolaRepository extends CrudRepository<InseEscolaModel, Long> {
	
	List<InseEscolaModel> findAllByEscolaModelIdAndAnoInicio(long idEscolaModel, int anoInicio);
}
