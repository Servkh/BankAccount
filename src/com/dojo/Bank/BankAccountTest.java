package com.dojo.Bank;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount client = new BankAccount();
		BankAccount client1 = new BankAccount();
		BankAccount client2 = new BankAccount();

		client.accountBalance();
		client1.accountBalance();
		
		client.deposit("checking", 250.0);
		client1.withdraw("savings", 3000.0);
		client2.deposit("checking", 150.0);
		
		client.accountBalance();
		client1.accountBalance();
		client2.accountBalance();
		

		
		

		





		
	}

}
