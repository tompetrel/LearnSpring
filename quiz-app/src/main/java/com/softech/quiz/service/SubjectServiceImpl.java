package com.softech.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softech.quiz.domains.Subject;
import com.softech.quiz.repositories.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	private SubjectRepository subjectRepository;

	@Override
	public long count() {
		return subjectRepository.count();
	}

	@Override
	public void delete(Subject arg0) {
		subjectRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		subjectRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Subject> arg0) {
		subjectRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Long arg0) {
		subjectRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Long arg0) {
		return subjectRepository.existsById(arg0);
	}

	@Override
	public Iterable<Subject> findAll() {
		return subjectRepository.findAll();
	}

	@Override
	public Iterable<Subject> findAllById(Iterable<Long> arg0) {
		return subjectRepository.findAllById(arg0);
	}

	@Override
	public Optional<Subject> findById(Long id) {
		return subjectRepository.findById(id);
	}

	@Override
	public Subject save(Subject subject) {
		return subjectRepository.save(subject);
	}

	@Override
	public <S extends Subject> Iterable<S> saveAll(Iterable<S> arg0) {
		return subjectRepository.saveAll(arg0);
	}

	@Override
	public List<Subject> findByName(String name) {
		return subjectRepository.findByName(name);
	}

	@Override
	public List<Subject> findByLogo(String logo) {
		return subjectRepository.findByLogo(logo);
	}

	@Override
	public List<Subject> findByNameStartingWith(String name) {
		return subjectRepository.findByNameStartingWith(name);
	}


	
}
