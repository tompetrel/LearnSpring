package com.softech.manager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softech.manager.models.Depart;

@Repository
public interface DepartRepository extends CrudRepository<Depart, Integer>{

}
