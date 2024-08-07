package org.guvitask;

public class Emp6Sr extends Employee6{


	public static void main(String[] args) {
		Emp6Sr emp = new Emp6Sr();
//Setting the values for Id, FirstName, LastName, Salary
emp.setId(12);
emp.setFirstName("mohan");
emp.setLastName("raj");
emp.setSalary(12000);
//calling raiseSalary method
emp.raiseSalary(20);
//printing salary After Raise of Salary
System.out.println("After Raise: "+emp.getSalary());
//printing the Annual salary Calculation
System.out.println("Annual salary: "+emp.anualSalary());
	}

}
