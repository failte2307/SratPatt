package com.bank.observer;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;


public class SuspiciousTransactionData implements Subject {
	
	private ArrayList observers;
	
	private String customerName; 
	
	private double amount; 
	
	private String transactionDate;
	
	private String transactionTime;
	
	private String transactionCountry;
	
	private String email;
	
	private String mobileNo;
	
	
	
	
	public SuspiciousTransactionData() {	
		observers = new ArrayList();
	}

	

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(customerName,amount,transactionDate,transactionTime,transactionCountry, mobileNo, email);
		}
	}
	
	public void suspiciousTransaction() {
		notifyObservers();
	}
	
	public void setSuspiciousTransactionDetails(String customerName, double amount, String transactionDate, String transactionTime, String transactionCountry,String mobileNo, String email ) {
		this.customerName = customerName;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.transactionCountry = transactionCountry; 
		this.mobileNo = mobileNo;
		this.email = email;
		suspiciousTransaction();
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getAmount() {
		return amount;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public String TransactionTime() {
		return transactionTime;
	}



	@Override
	public void registerObserver(Observer o) {
	 observers.add(o);	
	}



	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}



	public String getEmail() {
		return email;
	}



	public String getMobileNo() {
		return mobileNo;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}

