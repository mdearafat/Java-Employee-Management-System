

import java.util.*;
import java.lang.*;
import classes.*;
import interfaces.*;
import fileio.*;



public class Start{
	
	
	public static void main(String args[]){
		System.out.println();
		System.out.println("                    *******************************************************                    ");
		System.out.println("                    *******************************************************                    ");
		System.out.println("                    *******************************************************                    ");
		System.out.println("                    *******Welcome to the Employee Management System*******                    ");
		System.out.println("                    *******************************************************                    ");
		System.out.println("                    *******************************************************                    ");
		System.out.println("                    *******************************************************                    ");
		System.out.println();
		
			EmployeeInventory employees = new EmployeeInventory();
			Scanner takeinput = new Scanner(System.in);
			Scanner takestring = new Scanner(System.in);
			Features options = new Features();
			FileReadWrite frwd = new FileReadWrite();
			boolean check = true;
			
			
			
			//storing a default employee;
			
			employees.addDefaultEmployee("T","204",20,new Dates(30,9,2000),"Default Worker",new Dates(29,12,2019), 75000.00);
											
			///writing file for default employee
			frwd.writeInFile("Name : "+"T"+";"+"Id : "+"204"+";"+"Designation : "+"Default Worker"+";"+"Salary : "+75000.00);
			
			
			
		
			while(check)
			{	
				boolean optioncheck = false;
				options.projectFeatures();
				int op1 =-1;
				
				do{
					takeinput = new Scanner(System.in);
					try{
				          System.out.print("Please select your prefred option  :  ");
				          op1 = takeinput.nextInt();
						  optioncheck = true;
					}
					catch(InputMismatchException e){
						System.out.println("Invalid Option has been selected.Try again.");
					}
				}while(!optioncheck);
				
				switch(op1)
				{
					case 1 :
								System.out.println();
								System.out.println("You have selected option 1 :-");
								System.out.println();
								options.typesOfEmployee();
								boolean optioncheck2 = false;
								int op2 = -1;
								
								
								do{
									takeinput = new Scanner(System.in);
									try{
										  System.out.print("Please Select The Type Of Employee Profile You Want To Create  :  ");
										  op2 = takeinput.nextInt();
										  optioncheck2 = true;
									}
									catch(InputMismatchException e){
										System.out.println("Invalid Option has been selected.Try again");
									}
								}while(!optioncheck2);
								
								
								switch(op2)
								{
									
									case 1:
											
											
											
											boolean check1 = false;
											System.out.println();
											System.out.println("********Full-Time Employee********");
											System.out.println();
											System.out.print("Enter employee's name  : ");
											String takename = takestring.nextLine();
											System.out.print("Enter employee's ID    : ");
											String takeId = takestring.nextLine();
											int takeAge = -1;
											
											
											
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Enter employee's age   : ");
											        takeAge = takeinput.nextInt();
													if(takeAge == 0){throw new ArithmeticException("Age can't be zero .Please input again.");}
													if(takeAge < 0){throw new ArithmeticException("Age can't be negative.Please input again.");}
													
													check1 = true;
												}
												
												catch(ArithmeticException a){
													System.out.println(a.getMessage());
												}
												catch(InputMismatchException i){
													System.out.println("Age must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											}while(!check1);
											
											
											
											
											
								//////////////////////// Start(1) :    Exception handling for Date Month and Year/////////////////
											
											//initiLIZING
											
											int d = 0, m = 0, y = 0;
											
											
											//date 
											
											boolean checkd = false;
											
											System.out.println("Enter employee's DOB(date-month-year) :- ");
											
							
										do{	
												takeinput = new Scanner(System.in);
												
											try{
												System.out.print("Date   : ");
											     d = takeinput.nextInt();
												if((d == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
												else if((d < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
												else if( (d > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
												checkd = true;
											}
											catch(ArithmeticException e){
												System.out.println(e.getMessage());
											}
											catch(InputMismatchException i){
													System.out.println("Date must be an integer value.Please input again.");
											}
											catch(Exception e){
												System.out.println("Unknown error occured .Please input again.");
											}
								         }while(!checkd);
											
											
											
											//month
											
											boolean chcekm = false;
											
											do{
												takeinput = new Scanner(System.in);
											
												try{
													System.out.print("Month  : ");
													m = takeinput.nextInt();
													/*if((m <= 0) || (m > 12) ){throw new ArithmeticException("Month can't be zero or negative or greater than 12. Please input again. ");}*/
													if((m == 0)  ){throw new ArithmeticException("Month can't be zero. Please input again. ");}
													else if((m < 0)) {throw new ArithmeticException("Month can't be negative. Please input again. ");}
													else if( (m > 12) ){throw new ArithmeticException("Month can't be greater than 12. Please input again. ");}
													else if( (d > 29) && (m == 2 )) {throw new MyException();}
													chcekm = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
											
												}
												
											   catch(MyException my){
													System.out.println(my.getMessage());
														boolean checkdex = false;
															do{	
																  takeinput = new Scanner(System.in);
																
															try{
																System.out.print("Date   : ");
																 d = takeinput.nextInt();
																/*if((d <= 0) || (d > 31) ){throw new ArithmeticException("Date can't be zero or negative or greater than 31. Please input again. ");}*/
																if((d == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
																else if((d < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
																else if( (d > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
																checkdex = true;
															}
															catch(ArithmeticException e){
																System.out.println(e.getMessage());
															}
															catch(InputMismatchException i){
																	System.out.println("Date must be an integer value.Please input again.");
															}
															catch(Exception e){
																System.out.println("Unknown error occured .Please input again.");
															}
														 }while(!checkdex);
												}
												
												
												catch(InputMismatchException i){
														System.out.println("Month must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
												
											}while(!chcekm);
											
											
											//year
											
											boolean chceky = false;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Year   : ");
											        y = takeinput.nextInt();
													if((y == 0) ){throw new ArithmeticException("Year can't be zero. Please input again. ");}
													else if((y < 0) ){throw new ArithmeticException("Year can't be negative . Please input again. ");}
													else if( (y > 2020) ){throw new ArithmeticException("Year can't be greater than 2020. Please input again. ");}
													else if((y<1970)){throw new ArithmeticException("According to the company plolicy Year can't be less than 1971. Please input again. ");}
													chceky = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
												}
												catch(InputMismatchException i){
														System.out.println("Year must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											
											}while(!chceky);
											
							////////////////// End(1) :    Exception handling for Date Month and Year/////////////////
											
											
											System.out.print("Enter employee's designation : ");
											String takedes = takestring.nextLine();
											
											
											
						//////////////////// Start(2) :    Exception handling for Date Month and Year/////////////////
											
											
											//date 
											
											int  d2 =0 , m2 = 0 , y2 =0;
											
											boolean checkd2 = false;
											System.out.println("Enter employee's joining date(date-month-year) :- ");
											
										do{	
												takeinput = new Scanner(System.in);
												
											try{
												System.out.print("Date   : ");
											     d2 = takeinput.nextInt();
												/*if((d2 <= 0) || (d2 > 31) ){throw new ArithmeticException("Date can't be zero or negative or greater than 31. Please input again. ");}*/
												if((d2 == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
												else if((d2 < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
												else if( (d2 > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
												checkd2 = true;
											}
											catch(ArithmeticException e){
												System.out.println(e.getMessage());
											}
											catch(InputMismatchException i){
													System.out.println("Date must be an integer value.Please input again.");
											}
											catch(Exception e){
												System.out.println("Unknown error occured .Please input again.");
											}
								         }while(!checkd2);
											
											
											
											//month
											
											boolean chcekm2 = false;
											
											do{
												takeinput = new Scanner(System.in);
											
												try{
													System.out.print("Month  : ");
													m2 = takeinput.nextInt();
													/*if((m2 <= 0) || (m2 > 12) ){throw new ArithmeticException("Month can't be zero or negative or greater than 12. Please input again. ");}*/
													if((m2 == 0)  ){throw new ArithmeticException("Month can't be zero. Please input again. ");}
													else if((m2 < 0)) {throw new ArithmeticException("Month can't be negative. Please input again. ");}
													else if( (m2 > 12) ){throw new ArithmeticException("Month can't be greater than 12. Please input again. ");}
													
													if( (d2 > 29) && (m2 == 2 )) {throw new MyException();}
													chcekm2 = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
												}
												
												
												catch(MyException my){
													System.out.println(my.getMessage());
														boolean checkdex2 = false;
															do{	
																  takeinput = new Scanner(System.in);
																
															try{
																System.out.print("Date   : ");
																 d = takeinput.nextInt();
																/*if((d <= 0) || (d > 31) ){throw new ArithmeticException("Date can't be zero or negative or greater than 31. Please input again. ");}*/
																if((d2 == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
																else if((d2 < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
																else if( (d2 > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
																checkdex2 = true;
															}
															catch(ArithmeticException e){
																System.out.println(e.getMessage());
															}
															catch(InputMismatchException i){
																	System.out.println("Date must be an integer value.Please input again.");
															}
															catch(Exception e){
																System.out.println("Unknown error occured .Please input again.");
															}
														 }while(!checkdex2);
												}
												
												
												
												catch(InputMismatchException i){
														System.out.println("Month must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											}while(!chcekm2);
											
											
											//year
											
											boolean chceky2 = false;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Year   : ");
											        y2 = takeinput.nextInt();
													/*if((y2 <= 0) ){throw new ArithmeticException("Year can't be zero or negative or greater than 2020. Please input again. ");}*/
													if((y2 == 0) ){throw new ArithmeticException("Year can't be zero. Please input again. ");}
													else if((y2 < 0) ){throw new ArithmeticException("Year can't be negative . Please input again. ");}
													
													else if((y2<1970)){throw new ArithmeticException("According to the company plolicy Year can't be less than 1971. Please input again. ");}
													chceky2 = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
												}
												catch(InputMismatchException i){
														System.out.println("Year must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											
											}while(!chceky2);
											
						////////////////// End(2) :    Exception handling for Date Month and Year/////////////////
											
											
											
											
											/*System.out.println("Enter employee's date of joining (date-month-year) : ");
											
											System.out.print("Date   : ");
											 d2 = takeinput.nextInt();
											
											System.out.print("Month  : ");
											 m2 = takeinput.nextInt();
											
											System.out.print("Year   : ");
											 y2 = takeinput.nextInt();*/
											
											
				////////////////////////Exception handling Salary///////////////////////////////////////
											
											boolean checks = false;
											double takesalary = -1;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Enter employee's salary : ");
											        takesalary = takeinput.nextDouble();
													if(takesalary == 0){throw new ArithmeticException("Salary can't be zero.Please input again.");}
													else if(takesalary < 0){throw new ArithmeticException("Salary can't be negative.Please input again.");}
													checks = true;
												}
												catch(ArithmeticException a){
													System.out.println(a.getMessage());
												}
												catch(InputMismatchException i){
													System.out.println("Invalid Input.Salary must be a number.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											}while(!checks);
											
											
											
											employees.addEmployee(takename,takeId,takeAge,new Dates(d,m,y),takedes,new Dates(d2,m2,y2), takesalary);
											
											///writing file
											frwd.writeInFile("Name : "+takename+";"+"Id : "+takeId+";"+"Designation : "+takedes+";"+"Salary : "+takesalary);
											break;
										



										
								case 2:
										
										
											boolean check2 = false;
											System.out.println();
											System.out.println("********Part-Time Employee********");
											System.out.println();
											System.out.print("Enter employee's name  : ");
											String takename2 = takestring.nextLine();
											System.out.print("Enter employee's ID    : ");
											String takeId2 = takestring.nextLine();
											int takeAge2 = -1;
											
											
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Enter employee's age   : ");
											        takeAge2 = takeinput.nextInt();
													if(takeAge2 == 0){throw new ArithmeticException("Age can't be zero .Please input again.");}
													if(takeAge2 < 0){throw new ArithmeticException("Age can't be negative.Please input again.");}
													check2 = true;
												}
												
												catch(ArithmeticException a){
													System.out.println(a.getMessage());
												}
												catch(InputMismatchException i){
													System.out.println("Age must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											}while(!check2);
											
				////////////////////// Start(3) :    Exception handling for Date Month and Year/////////////////
											
											
											//date
											
											boolean checkd3 = false;
											
											System.out.println("Enter employee's DOB(date-month-year) :- ");
											
											
											int d3 = 0, m3 = 0, y3 = 0;
											
											
											
											
										do{	
												takeinput = new Scanner(System.in);
												
											try{
												System.out.print("Date   : ");
											     d3 = takeinput.nextInt();
												if((d3 == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
												else if((d3 < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
												else if( (d3 > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
												checkd3 = true;
											}
											catch(ArithmeticException e){
												System.out.println(e.getMessage());
											}
											catch(InputMismatchException i){
													System.out.println("Date must be an integer value.Please input again.");
											}
											catch(Exception e){
												System.out.println("Unknown error occured .Please input again.");
											}
								         }while(!checkd3);
											
											
											
											
											//month
											
											boolean chcekm3 = false;
											
											do{
												takeinput = new Scanner(System.in);
											
												try{
													System.out.print("Month  : ");
													m3 = takeinput.nextInt();
													if((m3 == 0)  ){throw new ArithmeticException("Month can't be zero. Please input again. ");}
													else if((m3 < 0)) {throw new ArithmeticException("Month can't be negative. Please input again. ");}
													else if( (m3 > 12) ){throw new ArithmeticException("Month can't be greater than 12. Please input again. ");}
													if( (d3 > 29) && (m3 == 2 )) {throw new MyException();}
													chcekm3 = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
											
												}
												
											   catch(MyException my){
													System.out.println(my.getMessage());
														boolean checkdex3 = false;
															do{	
																  takeinput = new Scanner(System.in);
																
															try{
																System.out.print("Date   : ");
																 d = takeinput.nextInt();
																if((d3 == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
																else if((d3 < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
																else if( (d3 > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
																checkdex3 = true;
															}
															catch(ArithmeticException e){
																System.out.println(e.getMessage());
															}
															catch(InputMismatchException i){
																	System.out.println("Date must be an integer value.Please input again.");
															}
															catch(Exception e){
																System.out.println("Unknown error occured .Please input again.");
															}
														 }while(!checkdex3);
												}
												
												
												catch(InputMismatchException i){
														System.out.println("Month must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
												
											}while(!chcekm3);
											
											
											//year
											
											boolean chceky3 = false;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Year   : ");
											        y3 = takeinput.nextInt();
													if((y3 == 0) ){throw new ArithmeticException("Year can't be zero. Please input again. ");}
													else if((y3 < 0) ){throw new ArithmeticException("Year can't be negative . Please input again. ");}
													else if( (y3 > 2020) ){throw new ArithmeticException("Year can't be greater than 2020. Please input again. ");}
													else if((y3<1970)){throw new ArithmeticException("According to the company plolicy Year can't be less than 1971. Please input again. ");}
													chceky3 = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
												}
												catch(InputMismatchException i){
														System.out.println("Year must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											
											}while(!chceky3);
											
											
											//////// End(3) :    Exception handling for Date Month and Year/////////////////
											
											
											/*System.out.println("Enter employee's date of birth(date-month-year) : ");
											int d3 = takeinput.nextInt();
											int m3 = takeinput.nextInt();
											int y3 = takeinput.nextInt();*/
											
											
											
											
											
											
											System.out.print("Enter employee's designation : ");
											String takedes2 = takestring.nextLine();
											
											
											
											//////// Start(4) :    Exception handling for Date Month and Year/////////////////
											
											
											//date
											
											boolean checkd4 = false;
											
											System.out.println("Enter employee's joining date(date-month-year) :- ");
											
											
											int d4 = 0, m4 = 0, y4 = 0;
											
											
											
											
										do{	
												takeinput = new Scanner(System.in);
												
											try{
												System.out.print("Date   : ");
											     d4 = takeinput.nextInt();
												if((d4 == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
												else if((d4 < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
												else if( (d4 > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
												checkd4 = true;
											}
											catch(ArithmeticException e){
												System.out.println(e.getMessage());
											}
											catch(InputMismatchException i){
													System.out.println("Date must be an integer value.Please input again.");
											}
											catch(Exception e){
												System.out.println("Unknown error occured .Please input again.");
											}
								         }while(!checkd4);
											
											
											
											//month
											
											boolean chcekm4 = false;
											
											do{
												takeinput = new Scanner(System.in);
											
												try{
													System.out.print("Month  : ");
													m4 = takeinput.nextInt();
													if((m4 == 0)  ){throw new ArithmeticException("Month can't be zero. Please input again. ");}
													else if((m4 < 0)) {throw new ArithmeticException("Month can't be negative. Please input again. ");}
													else if( (m4 > 12) ){throw new ArithmeticException("Month can't be greater than 12. Please input again. ");}
													
													if( (d4 > 29) && (m4 == 2 )) {throw new MyException();}
													chcekm4 = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
											
												}
												
											   catch(MyException my){
													System.out.println(my.getMessage());
														boolean checkdex4 = false;
															do{	
																  takeinput = new Scanner(System.in);
																
															try{
																System.out.print("Date   : ");
																 d4 = takeinput.nextInt();
																if((d4 == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
																else if((d4 < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
																else if( (d4 > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
																checkdex4 = true;
															}
															catch(ArithmeticException e){
																System.out.println(e.getMessage());
															}
															catch(InputMismatchException i){
																	System.out.println("Date must be an integer value.Please input again.");
															}
															catch(Exception e){
																System.out.println("Unknown error occured .Please input again.");
															}
														 }while(!checkdex4);
												}
												
												
												catch(InputMismatchException i){
														System.out.println("Month must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
												
											}while(!chcekm4);
											
											
											
											//year
											
											boolean chceky4 = false;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Year   : ");
											        y4 = takeinput.nextInt();
													if((y4 == 0) ){throw new ArithmeticException("Year can't be zero. Please input again. ");}
													else if((y4 < 0) ){throw new ArithmeticException("Year can't be negative . Please input again. ");}
													
													else if((y4<1970)){throw new ArithmeticException("According to the company plolicy Year can't be less than 1971. Please input again. ");}
													chceky4 = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
												}
												catch(InputMismatchException i){
														System.out.println("Year must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											
											}while(!chceky4);
											
							//////////////////// End(4) :    Exception handling for Date Month and Year/////////////////
											
											
											
											
											/*System.out.println("Enter employee's date of joining (date-month-year) : ");
											int d4 = takeinput.nextInt();
											int m4 = takeinput.nextInt();
											int y4 = takeinput.nextInt();*/
											
											
											//number of week handling
											
											boolean checkw = false;
											int numofweek = 0;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Enter the number of week employee will work :  ");
											        numofweek = takeinput.nextInt();
													if((numofweek <= 0) || (numofweek > 4)){throw new ArithmeticException("Number of week can't be zero or negative or more than 4.Please input again.");}
													checkw = true;
												}
												
												catch(ArithmeticException a){
													System.out.println(a.getMessage());
												}
												catch(InputMismatchException i){
													System.out.println("Number of week must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											}while(!checkw);
											
											
											
											
											
											
											///working days handling
											
											boolean checkwd = false;
											int workdays = 0;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Enter the number of working days per week   :  ");
											        workdays = takeinput.nextInt();
													if((workdays <= 0) || (workdays > 5)){throw new ArithmeticException("Working days can't be zero or negative or more than 5.Please input again.");}
													checkwd = true;
												}
												
												catch(ArithmeticException a){
													System.out.println(a.getMessage());
												}
												catch(InputMismatchException i){
													System.out.println("Working Days must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											}while(!checkwd);
											
											//working hour handling
											
											
											boolean checkwh = false;
											int workhours = 0;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Enter the number of working hourse per day  :  ");
											         workhours = takeinput.nextInt();
													if( (workhours <= 0) || ( workhours>8)){throw new ArithmeticException("Working hours can't be zero or negative or more than 8.Please input again.");}
													checkwh = true;
												}
												
												catch(ArithmeticException a){
													System.out.println(a.getMessage());
												}
												catch(InputMismatchException i){
													System.out.println("Working hours must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											}while(!checkwh);
											
											
											//rate per hour handling
											
											boolean checkrh = false;
											double rate = 0;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Enter the rate per hour  :  ");
											        rate = takeinput.nextDouble();
													if( rate <= 0){throw new ArithmeticException("Working rate per hour can't be zero or negative or greather than 8.Please input again.");}
													checkrh = true;
												}
												
												catch(ArithmeticException a){
													System.out.println(a.getMessage());
												}
												catch(InputMismatchException i){
													System.out.println("Invalid input.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											}while(!checkrh);
											
											
											employees.addEmployee(takename2,takeId2,takeAge2,new Dates(d3,m3,y3),takedes2,new Dates(d4,m4,y4), numofweek,workdays, workhours,rate);
											///writing file
											frwd.writeInFile("Name : "+takename2+";"+"Id : "+takeId2+";"+"Designation : "+takedes2+";"+"Rate per hour : "+rate);
											break;
										
										
										
										
										case 3 :
										
										
										
										
												boolean check3 = false;
											
											System.out.println();
											System.out.println("********Commisiion Employee********");
											System.out.println();
											System.out.print("Enter employee's name  : ");
											String takename3 = takestring.nextLine();
											System.out.print("Enter employee's ID    : ");
											String takeId3 = takestring.nextLine();
											int takeAge3 = -1;
											
											
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Enter employee's age   : ");
											        takeAge3 = takeinput.nextInt();
													if(takeAge3 == 0){throw new ArithmeticException("Age can't be zero.Please input again.");}
													if(takeAge3 < 0){throw new ArithmeticException("Age can't be zero .Please input again.");}
													check3 = true;
												}
												
												catch(ArithmeticException a){
													System.out.println(a.getMessage());
												}
												catch(InputMismatchException i){
													System.out.println("Age must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											}while(!check3);
											
							////////////////// Start(5) :    Exception handling for Date Month and Year/////////////////
											
											//date
											
											boolean checkd5 = false;
											
											System.out.println("Enter employee's DOB(date-month-year) :- ");
											
											
											int d5 = 0, m5 = 0, y5 = 0;
											
											
											
											
										do{	
												takeinput = new Scanner(System.in);
												
											try{
												System.out.print("Date   : ");
											     d5 = takeinput.nextInt();
												if((d5 == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
												else if((d5 < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
												else if( (d5 > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
												checkd5 = true;
											}
											catch(ArithmeticException e){
												System.out.println(e.getMessage());
											}
											catch(InputMismatchException i){
													System.out.println("Date must be an integer value.Please input again.");
											}
											catch(Exception e){
												System.out.println("Unknown error occured .Please input again.");
											}
								         }while(!checkd5);
											
											
											
											//month
											
											boolean chcekm5 = false;
											
											do{
												takeinput = new Scanner(System.in);
											
												try{
													System.out.print("Month  : ");
													m5 = takeinput.nextInt();
													if((m5 == 0)  ){throw new ArithmeticException("Month can't be zero. Please input again. ");}
													else if((m5 < 0)) {throw new ArithmeticException("Month can't be negative. Please input again. ");}
													else if( (m5 > 12) ){throw new ArithmeticException("Month can't be greater than 12. Please input again. ");}
													if( (d5 > 29) && (m5 == 2 )) {throw new MyException();}
													chcekm5 = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
											
												}
												
											   catch(MyException my){
													System.out.println(my.getMessage());
														boolean checkdex5 = false;
															do{	
																  takeinput = new Scanner(System.in);
																
															try{
																System.out.print("Date   : ");
																 d5 = takeinput.nextInt();
																if((d5 == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
																else if((d5 < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
																else if( (d5 > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
																checkdex5 = true;
															}
															catch(ArithmeticException e){
																System.out.println(e.getMessage());
															}
															catch(InputMismatchException i){
																	System.out.println("Date must be an integer value.Please input again.");
															}
															catch(Exception e){
																System.out.println("Unknown error occured .Please input again.");
															}
														 }while(!checkdex5);
												}
												
												
												catch(InputMismatchException i){
														System.out.println("Month must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
												
											}while(!chcekm5);
											
											
											//year
											
											boolean chceky5 = false;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Year   : ");
											        y5 = takeinput.nextInt();
													if((y5 == 0) ){throw new ArithmeticException("Year can't be zero. Please input again. ");}
													else if((y5 < 0) ){throw new ArithmeticException("Year can't be negative . Please input again. ");}
													else if( (y5 > 2020) ){throw new ArithmeticException("Year can't be greater than 2020. Please input again. ");}
													else if((y5<1970)){throw new ArithmeticException("According to the company plolicy Year can't be less than 1971. Please input again. ");}
													chceky5 = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
												}
												catch(InputMismatchException i){
														System.out.println("Year must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											
											}while(!chceky5);
											
											
						//////////////////// End(5) :    Exception handling for Date Month and Year/////////////////
											
											
											/*System.out.println("Enter employee's date of birth(date-month-year) : ");
											int d5 = takeinput.nextInt();
											int m5 = takeinput.nextInt();
											int y5 = takeinput.nextInt();*/
											
											
											
											System.out.print("Enter employee's designation : ");
											String takedes3 = takestring.nextLine();
											
											//////// Start(6) :    Exception handling for Date Month and Year/////////////////
											
											//date
											
											boolean checkd6 = false;
											
											System.out.println("Enter employee's joining date(date-month-year) :- ");
											
											
											int d6 = 0, m6 = 0, y6 = 0;
											
											
											
											
										do{	
												takeinput = new Scanner(System.in);
												
											try{
												System.out.print("Date   : ");
											     d6 = takeinput.nextInt();
												if((d6 == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
												else if((d6 < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
												else if( (d6 > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
												checkd6 = true;
											}
											catch(ArithmeticException e){
												System.out.println(e.getMessage());
											}
											catch(InputMismatchException i){
													System.out.println("Date must be an integer value.Please input again.");
											}
											catch(Exception e){
												System.out.println("Unknown error occured .Please input again.");
											}
								         }while(!checkd6);
											
											
											
											//month
											
											boolean chcekm6 = false;
											
											do{
												takeinput = new Scanner(System.in);
											
												try{
													System.out.print("Month  : ");
													m6 = takeinput.nextInt();
													if((m6 == 0)  ){throw new ArithmeticException("Month can't be zero. Please input again. ");}
													else if((m6 < 0)) {throw new ArithmeticException("Month can't be negative. Please input again. ");}
													else if( (m6 > 12) ){throw new ArithmeticException("Month can't be greater than 12. Please input again. ");}
													if( (d6 > 29) && (m6 == 2 )) {throw new MyException();}
													chcekm6 = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
											
												}
												
											   catch(MyException my){
													System.out.println(my.getMessage());
														boolean checkdex6 = false;
															do{	
																  takeinput = new Scanner(System.in);
																
															try{
																System.out.print("Date   : ");
																 d6 = takeinput.nextInt();
																if((d6 == 0)  ){throw new ArithmeticException("Date can't be zero. Please input again. ");}
																else if((d6 < 0)) {throw new ArithmeticException("Date can't be negative. Please input again. ");}
																else if( (d6 > 31) ){throw new ArithmeticException("Date can't be greater than 31. Please input again. ");}
																checkdex6 = true;
															}
															catch(ArithmeticException e){
																System.out.println(e.getMessage());
															}
															catch(InputMismatchException i){
																	System.out.println("Date must be an integer value.Please input again.");
															}
															catch(Exception e){
																System.out.println("Unknown error occured .Please input again.");
															}
														 }while(!checkdex6);
												}
												
												
												catch(InputMismatchException i){
														System.out.println("Month must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
												
											}while(!chcekm6);
											
											
											///year
											
											boolean chceky6 = false;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Year   : ");
											        y6 = takeinput.nextInt();
													if((y6 == 0) ){throw new ArithmeticException("Year can't be zero. Please input again. ");}
													else if((y6 < 0) ){throw new ArithmeticException("Year can't be negative . Please input again. ");}
													
													else if((y6<1970)){throw new ArithmeticException("According to the company plolicy Year can't be less than 1971. Please input again. ");}
													chceky6 = true;
												}
												catch(ArithmeticException e){
													System.out.println(e.getMessage());
												}
												catch(InputMismatchException i){
														System.out.println("Year must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											
											}while(!chceky6);
											
											
							///////////////// End(6) :    Exception handling for Date Month and Year/////////////////
											
											/*System.out.println("Enter employee's date of joining (date-month-year) : ");
											int d6 = takeinput.nextInt();
											int m6 = takeinput.nextInt();
											int y6 = takeinput.nextInt();*/
											
											//Sales exception handling
											
											boolean checksale = false;
											int sales = 0;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Enter the number of sales  :  ");
											         sales = takeinput.nextInt();
													if(sales <= 0){throw new ArithmeticException("Number of sales can't be zero or negative.Please input again.");}
													checksale = true;
												}
												
												catch(ArithmeticException a){
													System.out.println(a.getMessage());
												}
												catch(InputMismatchException i){
													System.out.println("Number of sales must be an integer value.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											}while(!checksale);
											
											
											//Comission handling
											
											boolean checkcom = false;
											double comission = 0;
											
											do{
												takeinput = new Scanner(System.in);
												try{
													System.out.print("Enter the ammount of commision per sale  :  ");
											        comission = takeinput.nextDouble();
													if( comission <= 0){throw new ArithmeticException("comission can't be zero or negative .Please input again.");}
													checkcom = true;
												}
												
												catch(ArithmeticException a){
													System.out.println(a.getMessage());
												}
												catch(InputMismatchException i){
													System.out.println("Invalid input.Please input again.");
												}
												catch(Exception e){
													System.out.println("Unknown error occured .Please input again.");
												}
											}while(!checkcom);
											
											
											employees.addEmployee(takename3,takeId3,takeAge3,new Dates(d5,m5,y5),takedes3,new Dates(d6,m6,y6),  sales,comission);
											///writing file
											frwd.writeInFile("Name : "+takename3+";"+"Id : "+takeId3+";"+"Designation : "+takedes3+";"+"Comission : "+comission);
											break;
											
										default :
										
												System.out.println("You have entered invalid option.Please try again.");
												break;
								}
								
							break;
				
				
				
				
					case 2 :
						System.out.println();
						System.out.println("You have selected option 2 :- ");
						System.out.println();
						
						System.out.print("Enter the employee's id you want to remove  :  ");
						String takeId4 = takestring.nextLine();
						employees. removeEmployee(takeId4);
						break;
				
					
					case 3:
						System.out.println();
						System.out.println("You have selected option 3 :- ");
						System.out.println();
						System.out.println("-------------------Shwoing all employees-------------------");
						System.out.println();
						System.out.println();
						employees.showAllEmployee();
						break;
						
					case 4 :
						System.out.println();
						System.out.println("You have selected option 4 :- ");
						System.out.println();
						System.out.print("Enter the employee's id to know the salary  :  ");
						
						String takeId5 = takestring.nextLine();
						System.out.println();
						employees.getEmployeeSalary(takeId5);
						break;
						
					case 5 :
					        System.out.println();
						    System.out.println("You have selected option 5 :- ");
						    System.out.println();
							
							System.out.print("Enter the id of the employee you want to increase salary  :  ");
							String takeId6 = takestring.nextLine();
							boolean chcekamm = false;
							double takeammount = 0;
							do{
								takeinput = new Scanner(System.in);
								try{
									System.out.print("Enter the ammount you want to increase  :  ");
							         takeammount = takeinput.nextDouble();
									 if(takeammount < 0){throw new ArithmeticException("Increased ammount can't be less than zero.");}
									 if(takeammount == 0){throw new ArithmeticException("Increased ammount can't be zero.");}
									chcekamm = true;
								}
								catch(InputMismatchException e){
									System.out.println("Inalid input. Please input again.");
								}
								catch(ArithmeticException a){
								System.out.println(a.getMessage());
								}
								
							}while(!chcekamm);
							employees.increaseSalary(takeId6 , takeammount);
							break;
							
					case 6 :
							System.out.println();
						    System.out.println("You have selected option 5 :- ");
						    System.out.println();
							
							
							System.out.print("Enter the employee's id to know the information  :  ");
							String takeId7 = takestring.nextLine();
							employees.employeeById(takeId7);
							break;
							
					case 7 :
							System.out.println();
							frwd.readFromFile();
							System.out.println();
							
							break;
					
					
					case 8 :
					        System.out.println();
							System.out.println("-------------------------------------------------");
							System.out.println("---------Thank you for using our service.--------");
							System.out.println("-------------------------------------------------");
							System.out.println();
							check = false;
							break;
							
					default :
					
							System.out.println();
							System.out.println("You have entered an invalid option.Please enter your prefered valid option.");
							System.out.println();
							break;
							
				
				}
				
			
}

}
}