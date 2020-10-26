package com.softech.quiz.service;

import java.util.List;
import java.util.Optional;

import com.softech.quiz.domains.Subject;

public interface SubjectService {

	<S extends Subject> Iterable<S> saveAll(Iterable<S> arg0);

	<S extends Subject> S save(S arg0);

	Optional<Subject> findById(Long id);

	Iterable<Subject> findAllById(Iterable<Long> arg0);

	Iterable<Subject> findAll();

	boolean existsById(Long arg0);

	void deleteById(Long arg0);

	void deleteAll(Iterable<? extends Subject> arg0);

	void deleteAll();

	void delete(Subject arg0);

	long count();

	List<Subject> findByName(String name);

	List<Subject> findByLogo(String logo);

	List<Subject> findByNameStartingWith(String name);




}
