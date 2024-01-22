package com.dr.saeb.repository;

import java.util.List; 

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
import com.dr.saeb.model.MunicipioModel;
 
@Repository
public interface MunicipioRepository extends CrudRepository<MunicipioModel, Long> {
	
	List<MunicipioModel> findAllByUnidadeFederativaModelId(long idUnidadeFederativaModel);
}
