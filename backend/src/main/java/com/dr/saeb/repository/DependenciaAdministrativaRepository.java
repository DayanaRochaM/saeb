package com.dr.saeb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dr.saeb.model.DependenciaAdministrativaModel;

@Repository
public interface DependenciaAdministrativaRepository extends CrudRepository<DependenciaAdministrativaModel, Long> {

}
