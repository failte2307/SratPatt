package com.bank.observer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class CustomerDAO {
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("bankPersistenceUnit");

	public EntityManager getEntityManager() {
	    return emf.createEntityManager();
	}
	


	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	
	public List<Customer> getCustomerById(int customerId){
		EntityManager em = getEntityManager();
		List <Customer> foundCustomer = new ArrayList();
		foundCustomer = em.createQuery("Select e from Customer e Where e.id = :customerId", Customer.class).setParameter("customerId",customerId).getResultList();
		
		
		return foundCustomer;
		}

	
	

}
