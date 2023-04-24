
package classes;
import classes.*;
import java.util.*;
import java.lang.*;

public class PartTimeEmployee extends Employee{
	
	//properties
	
	private int daysOfWorkPerWeek;
	private int hoursOfWorkPerDay;
	public int numOfWeek;
	private double ratePerHour;
	
	//constructor
	public PartTimeEmployee(){}
	
	public PartTimeEmployee(String name, String id, int age , Dates dateOfBirth, String designaton, Dates joiningDate,int numOfWeek, int daysOfWorkPerWeek , int hoursOfWorkPerDay, double ratePerHour)
		{	
		    super( name, id, age, dateOfBirth, designaton, joiningDate);
			this.numOfWeek = numOfWeek;
			this.daysOfWorkPerWeek = daysOfWorkPerWeek;
			this.hoursOfWorkPerDay = hoursOfWorkPerDay;
			this.ratePerHour = ratePerHour;
			
		}
	
	//setter methods
	 public void setDaysOfWorkPerWeek(int daysOfWorkPerWeek){this.daysOfWorkPerWeek = daysOfWorkPerWeek;}
	 public void setHoursOfWorkPerDay(int hoursOfWorkPerDay){this.hoursOfWorkPerDay = hoursOfWorkPerDay;}
	 public void setRatePerHour(double ratePerHour){this.ratePerHour = ratePerHour;}
	
	//getter methods
	
	 public int getDaysOfWorkPerWeek(){return daysOfWorkPerWeek;}
	 public int getHoursOfWorkPerDay(){return hoursOfWorkPerDay;}
	 public double getRatePerHour(){return ratePerHour;}
	
	
	//giving body to the inherited abstract methods
	
	//overriding
	public  double getSalary()
		{
			return numOfWeek*daysOfWorkPerWeek*hoursOfWorkPerDay*ratePerHour;
			
		}
	
	//overriding
	public  void increaseInSalary(double ammount){
		ratePerHour = ratePerHour + ammount;
	}
	
	
	public void showInfo(){
		super.showInfo();
		System.out.println("Number of working Days                   : "+daysOfWorkPerWeek);
		System.out.println("Number of working hours per day          : "+hoursOfWorkPerDay);
		System.out.println("Rate per hour                            : "+"$"+ratePerHour);
		System.out.println("Salary                                   : "+"$"+getSalary());
	}
	
	
}