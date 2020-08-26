package classes;
import java.lang.*;
import interfaces.*;

public class Bank implements CustomerOperations, EmployeeOperations{
	
	public int totalCustomer=0;
	public int totalEmployee=0;
	
	private Customer customers[] = new Customer[500];
	private Employee employees[] = new Employee[100];
	
	//These are from EmployeeOperations
	
		public void insertEmployee(Employee e){
		
		if(totalEmployee<employees.length){
			
			employees[totalEmployee++]=e;
			System.out.println("\nEmployee Inserted Successfully...");
		}
		else{
			System.out.println("\nSomething Wrong, Employee Cannot be Inserted...");
		}
	}
	
	public void removeEmployee(Employee e){
		
		int index=0;
		boolean found=false;
		
		for(int i=0;i<totalEmployee;i++){
			
			if(employees[i]==e){
				
				index=i;
				found=true;
				break;
			}
		}
		if(found){
			
			for(int i=index;i<totalEmployee-1;i++)
				
			employees[i]=employees[i+1];
			totalEmployee--;
			
			System.out.println("\nEmployee Removed Successfully...");
		}
		else{
			System.out.println("\nInvalid ID, Employee doesn't exist...");
		}
	}
	
	public Employee getEmployee(int empId){
		int i;
		Employee e = null;
		
		for(i=0;i<totalEmployee;i++){
			
			if(employees[i] != null){
			
			    //if(employees[i].getEmpId().equals(empId)){
				if(employees[i].getEmpId()==empId){
				
			    e = employees[i];
			    break;
			    }
		    }
		}
		return e;
	}
	
	public void showAllEmployees(){
		
		for(int i=0;i<totalEmployee;i++){
			
			if(employees[i] != null){
				
				System.out.println("Employee Name: "+ employees[i].getName());
				System.out.println("Employee Id: "+ employees[i].getEmpId());
				System.out.println("Employee Salary: "+ employees[i].getSalary());
				System.out.println();
			}
			else{
				System.out.println("\nThere are no Employees in the System...");
			}
		}
	}
	
	//These are from CustomerOperations
	
	public void insertCustomer(Customer c){
		
		if(totalCustomer<customers.length){
			
			customers[totalCustomer++]=c;
			System.out.println("\nCustomer Inserted Successfully...");
		}
		else{
			System.out.println("\nSomething Wrong, Customer Cannot be Inserted...");
		}
	}
	
	public void removeCustomer(Customer c){
		int index=0;
		boolean found=false;
		
		for(int i=0;i<totalCustomer;i++){
			
			if(customers[i]==c){
				
				index=i;
				found=true;
				break;
			}
		}
		if(found){
			
			for(int i=index;i<totalCustomer-1;i++)
			
			customers[i]=customers[i+1];
			totalCustomer--;
			
			System.out.println("\nCustomer Removed Successfully...");
		}
		else{
			System.out.println("\nInvalid ID, Restraunt doesn't exist...");
		}
	}
	
	public Customer getCustomer(int nid){
	    int i;
		Customer c = null;
		
		for(i=0;i<totalCustomer;i++){
			
			if(customers[i] != null){
				
			    //if(customers[i].getNid().equals(nid)){
				if(customers[i].getNid()==nid){
					
					c = customers[i];
			        break;
				}
			}
		}
		return c;
	}
	
	public void showAllCustomers(){
		
		for(int i=0;i<totalCustomer;i++){
			
			if(customers[i] != null){
				
				System.out.println("Customer Name: "+ customers[i].getName());
				System.out.println("Customer NId: "+ customers[i].getNid());
				System.out.println("\n---Account---");
				customers[i].showAllAccounts();
				System.out.println();
			}
		}
	}
}