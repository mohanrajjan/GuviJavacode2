package org.guvitask;

public class Account {
	//Defining data member in private modifier
private String accountNumber;
private double balance;
//creating constructor for the class
public Account() {
	this.accountNumber="";
	this.balance=0.0;
	}
//Arguments method for depositing amount, amount should be in positive ensuring 
//by if, else control statements
public void deposit(double amount) {
	if(amount>0) {
		balance +=amount;
		System.out.println("Deposited Amount:" + amount);
	}
	else {
		System.out.println("Deposit in positive");
	}
}
//Arguments method for withdrawing amount from account
public void withdraw(double amount) {
	if(amount>0 && amount<=balance) {
		balance -= amount ;
		System.out.println("Withdraw amount: "+ amount);
	}else if(amount>balance)
	{
		System.out.println("Insufficient balance");
	}
	else {
		System.out.println("Withdraw amount should be in positive");
	}
	}
//return type method for printing balance
public double checkbalance() {
	return balance;
}//creating setter & getter methods for data members for reusing & 
//accessing anywhere in the program
	public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
	public static void main(String[] args) {
	Account aa = new Account();
	//setting values for account number & deposit
	aa.setAccountNumber("117389");
	aa.setBalance(500);
	aa.deposit(1000);
	aa.withdraw(600);
	//Printing the balance amounts
	System.out.println("Balance amount: " + aa.checkbalance());
	
	}

}
