package Observer;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;


public class TransactionData implements Subject {
	
	private ArrayList observers;
	
	private String customerName; 
	
	private double amount; 
	
	private Date transactionDate;
	
	private Timestamp transactionTime;
	
	
	
	
	public TransactionData() {	
		observers = new ArrayList();
	}

	

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(customerName,amount,transactionDate,transactionTime);
		}
	}
	
	public void suspiciousTransaction() {
		notifyObservers();
	}
	
	public void setSuspiciousTransactionDetails(String customerName, double amount, Date transactionDate, Timestamp transactionTime) {
		this.customerName = customerName;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		suspiciousTransaction();
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getAmount() {
		return amount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public Timestamp getTransactionTime() {
		return transactionTime;
	}



	@Override
	public void registerObserver(java.util.Observer o) {
		observers.add(o);
		
	}



	@Override
	public void removeObserver(java.util.Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}	
	}



	
}


