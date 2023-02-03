package com.training.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.model.Person;
import com.training.repository.PersonRepo;

@Controller
public class PersonController {
	
	@Autowired
	PersonRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addPerson")
	public String addPerson(Person person)
	{
		repo.save(person);
		return "home.jsp";
	}
	
	@RequestMapping("/persons")
	@ResponseBody
	public Iterable<Person> getPersons()
	{
		return repo.findAll();
	}
	
}
