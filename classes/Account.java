package classes;
import java.lang.*;
import interfaces.*;
import fileio.*;

public abstract class Account implements ITransactions{
	
	protected int accountNumber;
	protected double balance;
	protected double transactions;
	int totalAccount=0;
	
	TransactionDetails td = new TransactionDetails();
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	public double getBalance(){
		return balance;
	}
	
	public abstract void showInfo();
	
	public void deposit(double amount){
		
		if(amount>0){
		
		System.out.println("\nPrevious Balance was: "+balance);
		System.out.println(+amount+ " $ Deposited...");
		
		balance = balance + amount;
		
		System.out.println("Current Balance is: "+balance);
		}
		else{
			System.out.println("Can Not Deposit...");
		}
	}
	
	public void withdraw(double amount){
		
		if(amount>0 && amount<=balance){
		
		System.out.println("\nPrevious Balance was: "+balance);
		System.out.println(+amount + " $ Withdrawn...");
		
		balance = balance - amount;
		
		System.out.println("Current Balance is: "+balance);
		}
		else{
			System.out.println("Cannot Withdraw,Invalid Or Insufficient Amount...");
		}
	}
	
	public void transfer(Account a, double amount){
		
		if(amount>0 && amount<=balance){
			
			System.out.println("\nPrevious Balance:	"+ this.balance);
			System.out.println("Transfer Amount: "+amount);
			
			this.balance = this.balance - amount;
			a.balance = a.balance + amount;
			
			System.out.println("Current Balance: "+ this.balance);
		}
		else{
			System.out.println("Can Not Transfer,Invalid Or Insufficient Amount...");
		}
	}
	
	public void getTransactions(){
		if(transactions>0){
			System.out.println("Deposited:	"+transactions);
		}
		else if(transactions>0){
			System.out.println("Withdrawn:	"+Math.abs(transactions));
		}
		else{
			System.out.println("No transactions occured");
		}
	}
}