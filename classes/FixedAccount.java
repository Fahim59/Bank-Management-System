package classes;
import java.lang.*;
import interfaces.*;

public class FixedAccount extends Account{
	
	private int tenureYear;
	
	public void setTenureYear(int tenureYear){
		this.tenureYear = tenureYear;
	}
	public int getTenureYear(){
		return tenureYear;
	}
	public void showInfo(){
		
		System.out.println("\nAccount Type: Fixed Account");
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Balance: "+getBalance());
		System.out.println("Tenure Year: "+ tenureYear);
	}
}