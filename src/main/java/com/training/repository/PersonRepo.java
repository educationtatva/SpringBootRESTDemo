package com.training.repository;
import org.springframework.data.repository.CrudRepository;

import com.training.model.Person;

public interface PersonRepo extends CrudRepository<Person, Integer>{
	
	
}
