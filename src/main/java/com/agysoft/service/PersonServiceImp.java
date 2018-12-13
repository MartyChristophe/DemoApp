package com.agysoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agysoft.dao.PersonDao;
import com.agysoft.entity.Person;

@Service
public class PersonServiceImp implements PersonService {

   @Autowired
   private PersonDao userDao;

   @Transactional
   @Override
   public void add(Person person) {
      userDao.add(person);
   }

   @Transactional
   @Override
   public List<Person> listPersons() {
      return userDao.listPersons();
   }

}
