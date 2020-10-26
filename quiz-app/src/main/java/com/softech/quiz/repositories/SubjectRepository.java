package com.softech.quiz.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softech.quiz.domains.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long>{
	List<Subject> findByName(String name);
	List<Subject> findByLogo(String logo);
	
	List<Subject> findByNameStartingWith(String name);
	
	
}
