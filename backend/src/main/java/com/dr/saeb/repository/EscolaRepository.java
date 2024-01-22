package com.dr.saeb.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dr.saeb.model.EscolaModel;

@Repository
public interface EscolaRepository extends CrudRepository<EscolaModel, Long> {
	
	List<EscolaModel> findAllByMunicipioModelId(long id);
}
