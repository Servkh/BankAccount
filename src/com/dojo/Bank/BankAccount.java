package com.dojo.Bank;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private Double checking;
	private Double savings;
	private static Integer numberOfAccount = 0;
	private static Double totalMoney = 0.0;
	
	
	public BankAccount() {
		this.accountNumber = generateAccountNumber();
		this.checking = 0.0;
		this.savings = 0.0;
		numberOfAccount++;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void accountBalance() {
		System.out.println("Total balance is: " + (this.getChecking() + this.getSavings()));
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Double getChecking() {
		return checking;
	}
	
	public void setChecking(Double checking) {
		this.checking = checking;
	}
	
	public Double getSavings() {
		return savings;
	}
	
	public void setSavings(Double savings) {
		this.savings = savings;
	}
	
	public void deposit(String accountType, Double amount) {
		if(accountType.equals("checking")) {
//			deposit money
			this.checking += amount;
			totalMoney += amount;
		}
		else if(accountType.equals("savings")) {
//			deposit money
			this.savings += amount;
			totalMoney += amount;
		}
		else {
			System.out.println("You don't have the right account type.");
		}
	}
	
	public void withdraw(String accountType, Double amount) {
		if(accountType.equals("checking")) {
			if(amount >= this.checking) {
				System.out.println("Not enough money");
			}
			else {
				this.checking -= amount;
				totalMoney -= amount;
			}
		}
		else if(accountType.equals("savings")) {
			if(amount >= this.savings) {
			System.out.println("Not enough money");
			}
			else {
				this.savings -= amount;
				totalMoney -= amount;
			}
		}
		else {
			System.out.println("You don't have the right account type.");
		}
	}
	
	public static Integer getNumberOfAccounts() {
		return numberOfAccount;
	}
	
	public static Double getTotalMoney() {
		return totalMoney;
	}
	
	
	private String generateAccountNumber() {
		Random rand = new Random();
		String account = "";
		for(int i = 0; i < 10; i++) {
			account += String.valueOf(rand.nextInt(10));
		}
		return account;
	}
}
