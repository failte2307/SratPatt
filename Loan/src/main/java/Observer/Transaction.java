package Observer;

import java.sql.Date;
import java.sql.Timestamp;

public class Transaction {
	
	private int paymentId;
	
	private int customerId;
	
	private String transactionCountry;
	
	private double amount;
	
	private Timestamp transactionDateTime;
	
	private boolean isSuspiciousTransaction;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getTransactionCountry() {
		return transactionCountry;
	}

	public void setTransactionCountry(String transactionCountry) {
		this.transactionCountry = transactionCountry;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Timestamp getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(Timestamp transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public Transaction(int paymentId, int customerId, String transactionCountry, double amount, Timestamp transactionDateTime, boolean isSuspiciousTransaction) {
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.transactionCountry = transactionCountry;
		this.amount = amount;
        this.transactionDateTime = transactionDateTime;
		this.setSuspiciousTransaction(isSuspiciousTransaction);
	}
	
	public boolean checkForSuspiciousTransaction(String customerCountry, String transactionCountry, boolean suspiciousTransaction) {
		if (customerCountry == transactionCountry ) {
			 return suspiciousTransaction = true;
		}	
		else {
			return suspiciousTransaction = false;
		}
	}
	
	
	public boolean isSuspiciousTransaction() {
		return isSuspiciousTransaction;
	}

	public void setSuspiciousTransaction(boolean isSuspiciousTransaction) {
		this.isSuspiciousTransaction = isSuspiciousTransaction;
	}


}
