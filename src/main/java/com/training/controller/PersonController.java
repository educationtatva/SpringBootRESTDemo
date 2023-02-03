package com.training.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Person;
import com.training.repository.PersonRepo;

//@Controller Option1
@RestController
public class PersonController {
	
	@Autowired
	PersonRepo repo;
	
	/* Option 1
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
	
	*/
		


	@PostMapping("/person")
	public Person addPersonThroughAPI(@RequestBody Person person)
	{
		System.out.println("person id "+person.getPid()+" and person name "+person.getPname());
		repo.save(person);
		return person;
	}

	
	
}
