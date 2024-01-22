package com.dr.saeb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dr.saeb.model.LocalizacaoModel; 

@Repository
public interface LocalizacaoRepository extends CrudRepository<LocalizacaoModel, Long> {

}
