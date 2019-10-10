package com.bank.observer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

public class CustomerDAO {
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	
	public Customer getCustomer(){
		Customer foundCustomer = new Customer();
		List<Employee> employeeQuery = entityManager.createQuery("Select e from Employee e", Employee.class).getResultList();
		
		for(Employee i : employeeQuery) {
			employeeList.add(new EmployeeDTO(i));
		}
		return employeeList;
		}

	
	

}