package com.bank.observer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

	
	@Autowired
	CustomerDAO customerDao;

	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/transactioncheck")
	public List<Customer> checkForSuspiciousTransaction() {
		List<Customer> returnedCustomer = new ArrayList();
		returnedCustomer = customerDao.getCustomerById(1);
		return returnedCustomer;
		
		
	}
}
