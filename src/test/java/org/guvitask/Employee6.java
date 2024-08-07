package org.guvitask;

public class Employee6 {
	//Defining as a private data members
	private int id;
	private String firstName;
    private String lastName;
    private int salary;
   //using getter & setter methods to set and get values
    //and to reuse when ever we need the data in the program
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getSalary() {
		return salary;
	}
	//Return method for Name
public String getName() {
	return firstName+" "+lastName;
}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
//Return type method for calculating annual salary
	public int anualSalary() {
		return salary*12;
	}
	//Method to raise the salary by a specified percentage
	public int raiseSalary(int percent){
		int raiseAmount= (this.salary * percent)/100;
		this.salary += raiseAmount;
		return this.salary;
	}
	//to String method to represent Employee6 object as string
	@Override
	public String toString() {
		return "Employee6 [id=" + id + ", firstName=" + firstName + ", "
				+ "lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
}
