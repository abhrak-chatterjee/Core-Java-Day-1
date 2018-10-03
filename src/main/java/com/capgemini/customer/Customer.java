package com.capgemini.customer;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.CurrentAccount;
import com.capgemini.bank.SavingsAccount;

public class Customer 
{
	public static void main(String[] args) 
	{
		BankAccount acc1 = new SavingsAccount();
		acc1.withdraw(500);
		acc1.deposit(5000);
		acc1.setAccountHolderName("Abhrak Chatterjee");
		acc1.isSalaryAccount();
		
		BankAccount acc2 = new CurrentAccount();
		acc2.withdraw(500);
		acc2.deposit(5000);
		acc2.setAccountHolderName("Abhrak Chatterjee");
		acc2.isSalaryAccount();
			
		System.out.println("BankAccount 1 "+"[accountNo=" + acc1.getAccountNo() + ", accountHolderName=" + acc1.getAccountHolderName() + ", accountBalance="
				+ acc1.getAccountBalance()+ "]");
		
		System.out.println("BankAccount 2 "+"[accountNo=" + acc2.getAccountNo() + ", accountHolderName=" + acc2.getAccountHolderName() + ", accountBalance="
				+ acc2.getAccountBalance()+ "]");
	}
}
