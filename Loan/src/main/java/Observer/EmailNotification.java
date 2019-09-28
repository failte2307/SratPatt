package Observer;

import java.sql.Date;
import java.sql.Timestamp;

public class EmailNotification implements Observer {
	
	private TransactionData transactionData;
	
	EmailConfiguration email = new EmailConfiguration();
	
	public EmailNotification(TransactionData transactionData) {
		this.transactionData = transactionData;
		transactionData.registerObserver(this);
		
	}

	@Override
	public void update(String customerName, double amount, Date transactionDate, Timestamp transactionTime, String TransactionCountry) {
		email.sendEmail(customerName, amount, transactionDate, transactionTime);	
	}
	

}
