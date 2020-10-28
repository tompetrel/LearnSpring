package com.softech.manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softech.manager.models.Depart;



@Controller
@RequestMapping("/departs")
public class DepartController {

	@GetMapping("/add")
	public String add(ModelMap model) {
		model.addAttribute("depart", new Depart());
		return "departs/addOrEdit";
	}
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(Depart depart) {
		return "departs/addOrEdit";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id) {
		return "departs/addOrEdit";
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return "list";
	}
	@RequestMapping("/list")
	public String list() {
		return "list";
	}
	@RequestMapping("/find")
	public String find() {
		return "find";
	}
}
