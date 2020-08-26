package classes;
import java.lang.*;

public class Employee{
	
	private int empId;
	private String name;
	private double salary;
	
	public void setEmpId(int empId){
		this.empId = empId;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public int getEmpId(){
		return empId;
	} 
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
}