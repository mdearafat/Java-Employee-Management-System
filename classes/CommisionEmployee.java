
package classes;
import classes.*;


import java.util.*;
import java.lang.*;


public class CommisionEmployee extends Employee{
	
	//properties
	
    public double sale;
	public double commission;
	
	//constructor
	public  CommisionEmployee(){}
	
    public CommisionEmployee(String name, String id, int age , Dates dateOfBirth, String designaton, Dates joiningDate,int sale,double commission)
	{
        super( name, id, age, dateOfBirth, designaton, joiningDate);
		this.sale = sale;
        this.commission = commission;
        
    }
	
	//setter methods
	public void setSale(int sale){this.sale = sale;}
	public void setComission(double commission){this.commission = commission;}
       
    //getter methods
	
	public double getSale(){return sale;}
	public double getComission(){return commission;}
	
	
	//giving body to the inherited abstract methods
	
	//overriding
	public  double getSalary()
		{
			return commission*sale;
			
		}
	//overriding
	public  void increaseInSalary(double ammount){
				
		commission = commission + ammount;
					
	}



	public void showInfo(){
		super.showInfo();
		System.out.println("Salary                                    : "+"$"+getSalary());
	}
	
	
}
	
	
