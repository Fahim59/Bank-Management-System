package classes;
import java.lang.*;
import interfaces.*;
import java.io.*;

public class Customer implements AccountOperations{
	
	public int totalAccount=0;
	
	private String name;
	private int nid;
	private Account accounts[] = new Account [10];
	
	
	public void setName(String name){
		this.name = name;
	}
	public void setNid(int nid){
		this.nid = nid;
	}
	
	
	public String getName(){
		return name;
	}
	public int getNid(){
		return nid;
	}
	
	//These are from AccountOperations
	
	public void insertAccount(Account a){
		
		if(totalAccount<accounts.length){
			
			accounts[totalAccount++]=a;
			System.out.println("\nAccount Inserted Successfully...");
		}
		else{
			System.out.println("\nSomething Wrong, Account Cannot be Inserted...");
		}
	}
	
	public void removeAccount(Account a){
		int index=0;
		boolean found=false;
		
		for(int i=0;i<totalAccount;i++){
			
			if(accounts[i]==a){
				
				index=i;
				found=true;
				break;
			}
		}
		if(found){
			
			for(int i=index;i<totalAccount-1;i++)
				
			accounts[i]=accounts[i+1];
			totalAccount--;
			
			System.out.println("\nAccount Removed Successfully...");
		}
		else{
			System.out.println("\nInvalid ID, Account doesn't exist...");
		}
	}
	
	public void showAllAccounts(){
		
		for(int i=0;i<totalAccount;i++){
			
			if(accounts[i] != null){
				
				accounts[i].showInfo();
				System.out.println();
			}
		}
	}
	
	public Account getAccount(int accountNumber){
		int i;
		Account a = null;
		
		for(i=0;i<totalAccount;i++){
			
			if(accounts[i] != null){
			
				if(accounts[i].getAccountNumber()==accountNumber){
					
					a = accounts[i];
			        break;
				}
			}
		}
		return a;
	}
}