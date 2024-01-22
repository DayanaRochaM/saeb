package com.dr.saeb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dr.saeb.model.AreaModel; 

@Repository
public interface AreaRepository extends CrudRepository<AreaModel, Long> {

}
