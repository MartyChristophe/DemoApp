package com.agysoft.service;

import java.util.List;

import com.agysoft.entity.Person;

public interface PersonService {
    void add(Person person);
    List<Person> listPersons();
}
