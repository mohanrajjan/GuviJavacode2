package org.guvitask;
public class Task6Person {
private int age;
private String name;
//Constructor with 2 arguments
public Task6Person(int age, String name) {
	this.name=name;
	this.age=age;
}//using getter method to attributes
	public int getAge() {
	return this.age;
}
public String getName() {
	return this.name;
}
	public static void main(String[] args) {//create object & providing attributes value
		Task6Person tk = new Task6Person(30, "Manirajan");
		System.out.println("NAME "+tk.getName());//using getter method to access attributes
		System.out.println("Age "+tk.getAge());

	}

}
