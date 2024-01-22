package com.dr.saeb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dr.saeb.model.UnidadeFederativaModel;

@Repository
public interface UnidadeFederativaRepository extends CrudRepository<UnidadeFederativaModel, Long> {
	
	List<UnidadeFederativaModel> findAllByRegiaoId(long idRegiao);
}
