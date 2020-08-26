import java.lang.*;
import java.util.*;
import java.io.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Main{
	public static void main(String args[]){
		try{
		
		    Scanner sc = new Scanner(System.in);
		    Bank b = new Bank();
		    TransactionDetails td = new TransactionDetails();
		
		    int option,input1,input2,input3,input4;
		
		do{
			System.out.println("-----------------------------------------");
		    System.out.println("               Welcome                   ");
			System.out.println("                  To                     ");
			System.out.println("      Online Bank Management System      ");
		    System.out.println("-----------------------------------------");
			System.out.println();
		    System.out.println("1. Employee Management");
		    System.out.println("2. Customer Management");
		    System.out.println("3. Customer Account Management");
		    System.out.println("4. Account Transactions");
	        System.out.println("5. Exit");
			
			System.out.print("\nEnter any choice To Start: ");
			
			option= sc.nextInt();
			
			switch(option){
				case 1: 
				
				System.out.println("\n\t*****Employee Management*****");
				System.out.println("\t-----------------------------");
				System.out.println("1. Insert New Employee");
		        System.out.println("2. Remove Existing Employee");
		        System.out.println("3. Show All Employees");
				System.out.println("4. Search An Employee");
		        System.out.println("5. Go Back");
				
				do{
			        System.out.print("\nEnter any choice: ");
					
					input1 = sc.nextInt();
					
					switch(input1){
						case 1:
						System.out.println("\t***Insert New Employee***");
						
						System.out.print("How many Employees you want to insert? " );
						int n = sc.nextInt();
						
						for(int i=0;i<n;i++){
						
						System.out.println("\n----Employee no."+(i+1)+"----");
						System.out.print("Enter Employee Name: ");
						String n1 = sc.next();
						
						System.out.print("Enter Employee ID: ");
						int id1 = sc.nextInt();
						
						System.out.print("Enter Employee Salary: ");
						double s1 = sc.nextDouble();
						
						Employee e1 = new Employee();
						e1.setEmpId(id1);
						e1.setName(n1);
						e1.setSalary(s1);
						
						b.insertEmployee(e1);
						}
						break;
						
						case 2:
						System.out.println("\t***Remove Existing Employee***");
						
						if(b.totalEmployee==0){
			                System.out.println("There are no Employees in the System...\n");
			                break;
		                }
						
						System.out.print("Enter Employee ID: ");
						int id2 = sc.nextInt();
						
						Employee e2 = b.getEmployee(id2);
						b.removeEmployee(e2);
						
						break;
						
						case 3:
						System.out.println("\t-----Displaying Employees-----");
						
						if(b.totalEmployee==0){
			                System.out.println("There are no Employees in the System...\n");
			                break;
		                }
						
						b.showAllEmployees();
						
						break;
						
						case 4:
						System.out.println("\t***Search An Employee***");
						
						if(b.totalEmployee==0){
			                System.out.println("There are no Employees in the System...\n");
			                break;
		                }
						
						System.out.print("Enter Employee ID: ");
							int id3 = sc.nextInt();
							
							Employee e3 = b.getEmployee(id3);
							
						if(e3 != null){
							
							System.out.println("\nEmployee ID: "+e3.getEmpId());
							System.out.println("Employee Name: "+e3.getName());
							System.out.println("Employee Salary: "+e3.getSalary());
						}
						else{
							System.out.println("Employee Does Not Exist...");
						}
						break;
						
						case 5:
						System.out.println("\t***Going Back***");
						break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input1!= 5);
				break;
				
				case 2: 
				
				System.out.println("\t*****Customer Management*****");
				System.out.println("\t-----------------------------");
				System.out.println("1. Insert New Customer");
		        System.out.println("2. Remove Existing Customer");
		        System.out.println("3. Show All Customers");
				System.out.println("4. Search A Customer");
		        System.out.println("5. Go Back");
				
				do{
			        System.out.print("\nEnter any choice: ");
					
					input2 = sc.nextInt();
					
					switch(input2){
						case 1:
						System.out.println("\t***Insert New Customer***");
					
					    System.out.print("How many Customers you want to insert? " );
					    int n = sc.nextInt();
					
					    for(int i=0;i<n;i++){
						
					    System.out.println("\n----Customer no."+(i+1)+"----");
					
					    System.out.print("Enter Customer Name: ");
					    String n1 = sc.next();
					
					    System.out.print("Enter Customer NID: ");
					    int id1 = sc.nextInt();
					
					    Customer c1 = new Customer();
					    c1.setName(n1);
					    c1.setNid(id1);
					
					    b.insertCustomer(c1);
					    }
						break;
						
						case 2:
						System.out.println("\t***Remove Existing Customer***");
					
					    if(b.totalCustomer==0){
			                System.out.println("There are no Customers in the System...\n");
			                break;
		                }
						
					    System.out.print("Enter Customer ID: ");
					    int id2 = sc.nextInt();
						
					    Customer c2 = b.getCustomer(id2);
						
						b.removeCustomer(c2);
						
						break;
						
						case 3:
						System.out.println("\t-----Displaying Customers-----");
						
						if(b.totalCustomer==0){
			                System.out.println("There are no Customers in the System...\n");
			                break;
		                }
						
					    b.showAllCustomers();
						break;
						
						case 4:
						System.out.println("\t***Search A Customer***");
						
						if(b.totalCustomer==0){
			                System.out.println("There are no Customers in the System...\n");
			                break;
		                }
						
					    System.out.print("Enter Customer ID: ");
					    int id3 = sc.nextInt();
					
					    Customer c3 = b.getCustomer(id3);
					
					    if(c3 != null){
					
					        System.out.println("\nCustomer NID: "+c3.getNid());
					        System.out.println("Customer Name: "+c3.getName());
						    c3.showAllAccounts();
					    }
					    else{
					        System.out.println("Customer Does Not Exist...");
					    }
						break;
						
						case 5:
					    System.out.println("\t***Going Back***");
					    break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input2!= 5);
				break;
				
				case 3: 
				
				System.out.println("\t*****Custmer Account Management*****");
				System.out.println("\t------------------------------------");
				System.out.println("1. Insert New Account");
		        System.out.println("2. Remove Existing Account");
				System.out.println("3. Show All Account");
				System.out.println("4. Search An Account");
				System.out.println("5. Go Back");
				
				do{
			        System.out.print("\nEnter any choice: ");
					
					input3 = sc.nextInt();
					
					switch(input3){
						case 1:
						System.out.println("\t***Insert New Account***");
						
						if(b.totalCustomer==0){
			                System.out.println("There are no Accounts in the System, Add an Account First...\n");
			                break;
		                }
						
					    System.out.print("How many FoodItems you want to insert? " );
					    int n = sc.nextInt();
						
					    for(int i=0;i<n;i++){
						
					    System.out.println("\n----Account no."+(i+1)+"----");
						
						System.out.println("Which Type of Account Do you Want to Add?");
						System.out.println("1. Savings Account");
						System.out.println("2. Fixed Account");
						System.out.println("3. Go Back");
						
						System.out.print("Your Type: ");
						int type = sc.nextInt();
						
						Account a1 = null;
						
						if(type == 1){
							
							System.out.print("Enter Account Number: ");
					        int ac1 = sc.nextInt();
							
					        System.out.print("Enter Account Balance: ");
					        double b1 = sc.nextDouble();
							
							System.out.print("Enter Interest Rate: ");
					        int i1 = sc.nextInt();
							
							SavingsAccount sa = new SavingsAccount();
					
					        sa.setAccountNumber(ac1);
							sa.setBalance(b1);
							sa.setInterestRate(i1);
							
							a1 = sa;
						}
						else if(type == 2){
							System.out.print("Enter Account Number: ");
					        int ac2 = sc.nextInt();
							
					        System.out.print("Enter Account Balance: ");
					        double b2 = sc.nextDouble();
							
							System.out.print("Enter Tenure Year: ");
					        int ty1 = sc.nextInt();
							
							FixedAccount fa = new FixedAccount();
								
							fa.setAccountNumber(ac2);
							fa.setBalance(b2);
							fa.setTenureYear(ty1);
							
							a1 = fa;
						}
						else if(type == 3){
							System.out.println("Going Back...");
						}
						else{
							System.out.println("Invalid Type...");
						}
						
						if(a1 != null){
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							
							b.getCustomer(nid1).insertAccount(a1);
						}
					}
						break;
						
						case 2:
						System.out.println("\t***Remove Existing Account***");
						
						if(b.totalCustomer==0){
			                System.out.println("There are no Accounts in the System...\n");
			                break;
						}
						
						System.out.print("Enter Customer NID: ");
						int nid2 = sc.nextInt();
						
					    System.out.print("Enter Account Number: ");
					    int id2 = sc.nextInt();
						
						b.getCustomer(nid2).removeAccount(b.getCustomer(nid2).getAccount(id2));
						
						break;
						
						case 3:
						System.out.println("\t-----Displaying Accounts-----");
						
						if(b.totalCustomer==0){
			                System.out.println("There are no Accounts in the System...\n");
			                break;
						}
						
						System.out.print("Enter Customer NID: ");
						int id3 = sc.nextInt();
						
						b.getCustomer(id3).showAllAccounts();
						
						break;
						
						case 4:
						System.out.println("\t***Search An Account***");
						
						if(b.totalCustomer==0){
			                System.out.println("There are no Accounts in the System...\n");
			                break;
						}
						
						System.out.print("Enter Customer NID: ");
						int nid3 = sc.nextInt();
						System.out.print("Enter Account Number: ");
						int id4 = sc.nextInt();
						
						Account a2 = b.getCustomer(nid3).getAccount(id4);
						
						if(a2 != null){
							a2.showInfo();
						}
						break;
						
						case 5:
						
						System.out.println("\t***Going Back***");
						break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input3!= 5);
				break;
				
				case 4:
				
				System.out.println("\t*****FoodItem Quantity Add-Sell*****");
				System.out.println("\t------------------------------------");
				System.out.println("1. Deposit Money");
		        System.out.println("2. Withdraw Money");
				System.out.println("3. Transfer Money");
				System.out.println("4. Show Transaction");
				System.out.println("5. Go Back");
				
				do{
			        System.out.print("\nEnter any choice: ");
					
					input4 = sc.nextInt();
					
					switch(input4){
						case 1:
						System.out.println("\tDeposit Money");
						
						System.out.print("Enter Customer NID: ");
						int nid1 = sc.nextInt();
						
						System.out.print("Enter Account Number: ");
						int an1 = sc.nextInt();
						
						System.out.print("Enter Deposit Amount: ");
						double d1 = sc.nextDouble();
						
						if(d1>0){
							
							td.writeInFile(+d1+" $ has been Deposited in Account Number "+ an1);
							b.getCustomer(nid1).getAccount(an1).deposit(d1);
						}
						break;
						
						case 2:
						System.out.println("\tWithdraw Money");
						
						System.out.print("Enter Customer NID: ");
						int nid2 = sc.nextInt();
						
						System.out.print("Enter Account Number: ");
						int an2 = sc.nextInt();
						
						System.out.print("Enter Withdrawal Amount: ");
						double d2 = sc.nextDouble();
						
						if(d2>0 && d2<= b.getCustomer(nid2).getAccount(an2).getBalance()){
							
							td.writeInFile(+d2+" $ has been Withdrawn from Account Number "+ an2);
							b.getCustomer(nid2).getAccount(an2).withdraw(d2);
						}
						break;
						
						case 3:
						System.out.println("\t***Transfer Money***");
						
						System.out.print("Enter From Customer NID: ");
						int fromNid = sc.nextInt();
						System.out.print("Enter From Account Number: ");
						int fromAN = sc.nextInt();
						System.out.print("Enter Transfer Amount: ");
						double d3 = sc.nextDouble();
						
						System.out.println();
						
						System.out.print("Enter To Customer NID: ");
						int toNid = sc.nextInt();
						System.out.print("Enter To Account Number: ");
						int toAN = sc.nextInt();
						
						if(d3>0 && d3 <= b.getCustomer(fromNid).getAccount(fromAN).getBalance()){
							
							b.getCustomer(fromNid).getAccount(fromAN).transfer(b.getCustomer(toNid).getAccount(toAN), d3);
							td.writeInFile(+d3+" $ has been Transfered from Account Number "+ fromAN+" to Account Number "+toAN);
						}
						break;
						
						case 4:
						System.out.println("\t***Showing Transactions***");
						td.readFromFile();
						
						break;
						
						case 5:
						System.out.println("\t***Going Back***");
						break;
						
						default :
						System.out.println("Invalid Option!! Enter Again...");
						break;
					}
				}
				while(input4!= 4);
				break;
				
				case 5:
				System.out.println("\t***System Closing...***");
				System.exit(0);
				break;
				
				default :
				System.out.println("Invalid Option!! Enter Again...");
				break;
			}
		}
		while(option!= 5);
		}
		catch(InputMismatchException a){
				System.out.println("------------------------------------------------");
				System.out.println("Oops !!! You have entered wrong input...");
				System.out.println("Exception Occured!!! InputMismatchException...");
				System.out.println("------------------------------------------------");
		}
	}
}