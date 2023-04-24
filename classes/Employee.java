

package classes;
import classes.*;
public abstract  class Employee{
	
	
	//properties
	
	private String name;
	private String id;
	private int	age;
	private Dates dateOfBirth;
	private String designaton;
	private Dates joiningDate;
	
	
	//constructor
	
	public Employee(){}
	
	
	public Employee(String name, String id, int age , Dates dateOfBirth, String designaton, Dates joiningDate)
	{
		this.name = name;
		this.id = id;
		this.age = age;
		this.designaton = designaton;
		this.dateOfBirth = dateOfBirth;
		this.joiningDate = joiningDate;
		
		
	}
	
	//setter methods
	
	public void setName(String name){this.name = name;}
	public void setId(String id){this.id = id;}
	public void setAge(int age){this.age = age;}
	public void setDateOfBirth(Dates dateOfBirth){this.dateOfBirth = dateOfBirth;}
	public void setDesignaton(String designaton){this.designaton = designaton;}
	public void setJoiningDate(Dates joiningDate){this.joiningDate = joiningDate;}
	
	//getter methods
	
	public String getName(){return name;}
	public String getId(){return id;}
	public int getAge(){return age;}
	public Dates getDateOfBirth(){return dateOfBirth;}
	public String getDesignaton(){return designaton;}
	public Dates getJoiningDate(){return joiningDate;}
	
	//methods
	
	public void showInfo(){
		
		System.out.println("Name                                     : "+name);
		System.out.println("ID                                       : "+id);
		System.out.println("Age                                      : "+age);
		System.out.println("Date Of Birth                            : "+dateOfBirth.getDate());
		System.out.println("Designation                              : "+designaton);
		System.out.println("Joining Date                             : "+joiningDate.getDate());
		
	}
	
	//using abstract methods
	
	public abstract double getSalary();
	public abstract void increaseInSalary(double ammount);
    
	
	
	
	
	
	
	
	
}