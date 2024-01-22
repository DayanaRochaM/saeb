package com.dr.saeb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dr.saeb.model.RegiaoModel;

@Repository
public interface RegiaoRepository extends CrudRepository<RegiaoModel, Long> {

}
