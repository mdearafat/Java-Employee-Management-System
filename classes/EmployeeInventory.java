package classes;
import classes.*;
import interfaces.*;
import java.util.*;


public class EmployeeInventory implements IBasicEmployeeOperations, IQueryOperations,IUpdateOperations

{
	
	
	private Employee employees[] = new Employee[751]; //750 employees can be stored
	
	
	//implementing basic operations
	
	
	//for adding a new eomployee
	
	public void addEmployee(Employee eomployee)
	{
		boolean check = false;
		for(int i = 0; i<employees.length ; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = eomployee;
				check = true;
				break;
			}
		}
		if(check == true)
		{
			System.out.println();
			System.out.println("--------------------------New employee is added.--------------------------");
			System.out.println();
		}
		else
		{
			System.out.println("--------------------------New employee can't be added.--------------------------");
		}
		
		
	}
	
	//full-time employee
	public void addEmployee(String name, String id, int age , Dates dateOfBirth, String designaton, Dates joiningDate,double monthlysalary)
	{
		FullTimeEmployee e = new FullTimeEmployee(name, id, age, dateOfBirth, designaton, joiningDate, monthlysalary );
		addEmployee(e);
	}
	
	//part-time employee
	
	public void addEmployee(String name, String id, int age , Dates dateOfBirth, String designaton, Dates joiningDate, int numOfWeek,int daysOfWorkPerWeek , int hoursOfWorkPerDay, double ratePerHour)
	{
		PartTimeEmployee e = new PartTimeEmployee(name, id, age, dateOfBirth, designaton, joiningDate, numOfWeek, daysOfWorkPerWeek, hoursOfWorkPerDay, ratePerHour );
		addEmployee(e);
	}
	//comission employee
	public void addEmployee(String name, String id, int age , Dates dateOfBirth, String designaton, Dates joiningDate, int sale,double commission)
	{
		CommisionEmployee e = new CommisionEmployee(name, id, age, dateOfBirth, designaton, joiningDate, sale, commission );
		addEmployee(e);
	}
	
	
	//to remove a employee(using employee id)
	
	
	public void removeEmployee(String employeeId)
	{
		boolean check = false;
		for(int i = 0; i<employees.length ; i++)
		{
			if(employees[i] != null)
			{
				if((employees[i].getId()).equals(employeeId))
				{
					employees[i] = null;
					check = true;
					break;
				}
				
			}
		}
		if(check == true)
		{
			System.out.println();
			System.out.println("--------------------------Employee is removed.All of the informations are erased.--------------------------");
			System.out.println();
		}
		else    
		{
			System.out.println();
			System.out.println("--------------------------Employee can't be removed.There is no employee with this Id.--------------------------");
			System.out.println();
		}
	}
	
	
	//showing info
	
	public void showAllEmployee()
	{	
		boolean check = false;
		for(int i = 0; i<employees.length ; i++)
		{
			if(employees[i] != null)
			{
				    System.out.println("*************************************************");
					employees[i].showInfo(); 
					
					System.out.println("*************************************************");
					System.out.println();
					System.out.println();
					 check = true;
				
			}
		}
			
		if( check){
			System.out.println("");
				
		}
			
		else{
			System.out.println();
			System.out.println("--------------------------Sorry, no employee to show.--------------------------");
			System.out.println();
		}
	
	}
	
	
	
	
	
	//to get salary
	
	public void getEmployeeSalary(String employeeId)
	{
			boolean check = false;
			for(int i= 0 ;  i<employees.length ; i++){
				
				if(employees[i] != null)
				{
						if((employees[i].getId()).equals(employeeId))
						{
							System.out.println();
							System.out.print("The salary of the employee is  :  "+"$"+employees[i].getSalary());
							System.out.println();
							 check = true;
							 break;
						}		
				}
		
			}
			if( check){
				System.out.println("");
				
			}
			
			else{
				System.out.println();
			    System.out.println("--------------------------Employee is not found.There is no employee with this Id.--------------------------");
			    System.out.println();
			}
		
	}
	
	
	//increase in salary
	
	public void increaseSalary(String employeeId, double ammount)
	{
		boolean check = false;
		
		for(int i= 0 ;  i<employees.length ; i++)
		{
			
			if(employees[i] != null){
					if((employees[i].getId()).equals(employeeId))
						{
							
						   employees[i].increaseInSalary(ammount);
							check = true;
							break;
						}
			}
		}
		if(check == true)
		{
			System.out.println();
			System.out.println("--------------------------Employee is found.Salary has been increased.--------------------------");
			System.out.println();
		}
		else    
		{
			System.out.println();
			System.out.println("--------------------------Sorry, employee is not found.There is no employee with this Id. Salary can't be increased.--------------------------");
			System.out.println();
		}
	
	}
	
	
	
	
	
	
	
	
	
	//query operations
	
	//searching employee using employee's id and displaying the informations
	
	public void employeeById(String employeeId)
	{
		//Employee e = null;
		boolean check = false;
		for(int i = 0; i<employees.length ; i++)
			{
					if(employees[i] != null)
					  {
							if((employees[i].getId()).equals(employeeId))
							{	
                                System.out.println();							
								System.out.println("---------------Showing the informations--------------- ");
								System.out.println();
								employees[i].showInfo();
								check = true;
								break;
									
							}
							
					  }
				
			
		 }
		
		if(check)
		   {
			  System.out.println("");
		   }
		else    
		{
			System.out.println();
			System.out.println("--------------------------Sorry, employee is not found.There is no employee with this Id.--------------------------");
			System.out.println();
		}
	   
	}
	
	
	
	
	
//for default employee
public void addDefaultEmployee(Employee eomployee)
	{
		boolean check = false;
		for(int i = 0; i<employees.length ; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = eomployee;
				check = true;
				break;
			}
		}
		if(check == true)
		{
		
		}
		else
		{
			System.out.println("--------------------------New employee can't be added.--------------------------");
		}
		
		
	}
	public void addDefaultEmployee(String name, String id, int age , Dates dateOfBirth, String designaton, Dates joiningDate,double monthlysalary)
	{
		FullTimeEmployee e = new FullTimeEmployee(name, id, age, dateOfBirth, designaton, joiningDate, monthlysalary );
		addDefaultEmployee(e);
	}


	
	
	
	
	
	
}

