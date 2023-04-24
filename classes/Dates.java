package classes;
import classes.*;
public class Dates{
	
	//properties 
	
	private int day;
	private int month;
	private int year;
	
	
	public Dates(int day , int month , int year){
		
		this.day =day;
		this.month = month;
		this.year = year;
		//System.out.println("The date is set(parameterized constructor)");
		
	}
	
	//setter methods
	public void setDay(int day){this.day = day;} 
	public void setMonth(int month){this.month = month;} 
	public void setYear(int year){this.year = year;} 
	
	//getter methods
	public int getDay(){return day;} 
	public int getMonth(){return month;} 
	public int getYear(){return year;}



	public 	String getDate(){
		return day+"-"+month+"-"+year;
		
	}

	
	public void showDate(){

	 System.out.println(day+"-"+month+"-"+year);
	}
	
	
}