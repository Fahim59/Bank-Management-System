package classes;
import java.lang.*;
import interfaces.*;

public class SavingsAccount extends Account{
	
	private double interestRate;
	
	public void setInterestRate(double interestRate){
		this.interestRate = interestRate;
	}
	public double getInterestRate(){
		return interestRate;
	}
	public void showInfo(){
		
		System.out.println("\nAccount Type: Savings Account");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Interest Rate: "+interestRate);
	}
}