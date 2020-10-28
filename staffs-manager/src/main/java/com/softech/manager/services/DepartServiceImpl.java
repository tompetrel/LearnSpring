package com.softech.manager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softech.manager.models.Depart;
import com.softech.manager.repositories.DepartRepository;

@Service
public class DepartServiceImpl implements DepartService{
	@Autowired
	private DepartRepository departRepository;

	@Override
	public long count() {
		return departRepository.count();
	}

	@Override
	public void delete(Depart arg0) {
		departRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		departRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Depart> arg0) {
		departRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		departRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return departRepository.existsById(arg0);
	}

	@Override
	public Iterable<Depart> findAll() {
		return departRepository.findAll();
	}

	@Override
	public Iterable<Depart> findAllById(Iterable<Integer> arg0) {
		return departRepository.findAllById(arg0);
	}

	@Override
	public Optional<Depart> findById(Integer arg0) {
		return departRepository.findById(arg0);
	}

	@Override
	public <S extends Depart> S save(S arg0) {
		return departRepository.save(arg0);
	}

	@Override
	public <S extends Depart> Iterable<S> saveAll(Iterable<S> arg0) {
		return departRepository.saveAll(arg0);
	}
	
	
}
