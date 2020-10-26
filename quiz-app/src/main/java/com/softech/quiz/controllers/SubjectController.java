package com.softech.quiz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softech.quiz.domains.Subject;
import com.softech.quiz.exceptions.SubjectNotPoundException;
import com.softech.quiz.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	private SubjectService subjectService;
//	@GetMapping("")
//	public String get() {
//		return "Get Subject";
//	}
	@PostMapping("")
	public Subject insert(@RequestBody Subject subject) {
		return subjectService.save(subject);
	}
	@GetMapping("")
	public List<Subject> listAll(){
		return (List<Subject>) subjectService.findAll();
	}
	@PutMapping("/{id}/update")
	public Subject update(@PathVariable Long id,@RequestBody Subject subject) {
		return subjectService.findById(id).map(sub->{
			sub.setName(subject.getName());
			sub.setLogo(subject.getLogo());
			return subjectService.save(sub);
		}).get();
	}
	@GetMapping("/{id}/find")
	public Subject findByID(@PathVariable Long id) {
		return subjectService.findById(id).orElseThrow(()->new SubjectNotPoundException());
	}
	@DeleteMapping("/{id}/delete")
	public String delete(@PathVariable Long id) {
		subjectService.deleteById(id);
		return "Delete Successfully";
	}
	@GetMapping("/{name}/findname")
	public List<Subject> findByName(@PathVariable String name) {
		return subjectService.findByName(name);
	}
	@GetMapping("/{logo}/findlogo")
	public List<Subject> findByLogo(@PathVariable String logo) {
		return subjectService.findByLogo(logo);
	}
	@GetMapping("/{name}/findnamelike")
	public List<Subject> findByNameStartingWith(@PathVariable String name){
		return subjectService.findByNameStartingWith(name);
	}
	
}
