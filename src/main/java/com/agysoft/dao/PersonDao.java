package com.agysoft.dao;

import java.util.List;

import com.agysoft.entity.Person;

public interface PersonDao {
	   void add(Person person);
	   List<Person> listPersons();
}
