package com.jpaDatabase.application.manager;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;

import com.jpaDatabase.application.EntityBean.Person;

@Repository
@Transactional 
public class PersonJpaRepository {

	//Connecting to the database
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id){
		return entityManager.find(Person.class, id);
	}
}
