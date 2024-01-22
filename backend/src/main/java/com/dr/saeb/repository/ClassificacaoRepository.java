package com.dr.saeb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dr.saeb.model.ClassificacaoModel;
 
@Repository
public interface ClassificacaoRepository extends CrudRepository<ClassificacaoModel, Long> {

}
