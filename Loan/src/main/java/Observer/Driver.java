package Observer;

public class Driver {
	
	private static EmailConfiguration emailConfig = new EmailConfiguration();
	
	public static void main (String args[]) {
		
		TransactionData data = new TransactionData();
		EmailNotification bla = new EmailNotification(data);
		
		TransactionData test = new TransactionData();
		data.setSuspiciousTransactionDetails("test", 1, null, null,null);
		
	
	}

}
