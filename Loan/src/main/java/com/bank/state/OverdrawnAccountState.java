package com.bank.state;

public class OverdrawnAccountState implements AccountState {
	
	
	 private Account account;
	 
	 public OverdrawnAccountState(Account account) {
		 this.account = account;
	 }

	public double Withdraw(double Amount) {
		return 3;

	}

	public double Deposit(double Amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double viewBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void checkState() {
		// TODO Auto-generated method stub
		
	}


}