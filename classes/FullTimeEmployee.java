package classes;
import classes.*;

import java.util.*;
import java.lang.*;


public class FullTimeEmployee extends Employee{
	
	//properties
	
	private double monthlysalary;
	
	//constructor
	
	public FullTimeEmployee(){}
	
	
	public FullTimeEmployee( String name, String id, int age , Dates dateOfBirth, String designaton, Dates joiningDate,double monthlysalary)
		{
			super( name, id, age, dateOfBirth, designaton, joiningDate);
			this.monthlysalary = monthlysalary;
			
		}
	
	//setter methods
	 
	 public void setMonthlySalary(double monthlysalary){this.monthlysalary = monthlysalary;}
	
	//getter methods
	
	
	 public double getMonthlySalary(){return monthlysalary;}
	
	
	//giving body to the inherited abstract methods
	
	//overriding
	public  double getSalary()
		{
			return monthlysalary;
			
		}
	
	//overriding
	public  void increaseInSalary(double ammount) {
		monthlysalary = monthlysalary + ammount;
	}
	

	public void showInfo(){
		super.showInfo();
		System.out.println("Monthly Salary                            : "+"$"+getSalary());
	}
	
	
}