package com.softech.manager.services;

import java.util.Optional;

import com.softech.manager.models.Depart;

public interface DepartService {

	<S extends Depart> Iterable<S> saveAll(Iterable<S> arg0);

	<S extends Depart> S save(S arg0);

	Optional<Depart> findById(Integer arg0);

	Iterable<Depart> findAllById(Iterable<Integer> arg0);

	Iterable<Depart> findAll();

	boolean existsById(Integer arg0);

	void deleteById(Integer arg0);

	void deleteAll(Iterable<? extends Depart> arg0);

	void deleteAll();

	void delete(Depart arg0);

	long count();

}
