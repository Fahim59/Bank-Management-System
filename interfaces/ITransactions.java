package interfaces;
import java.lang.*;
import classes.Account;

public interface ITransactions{
	
	public abstract void withdraw(double amount);
	void deposit(double amount);
	void transfer(Account a, double amount);
}