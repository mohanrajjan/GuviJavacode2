package org.guvitask;

public class Circle {
	//defining data member
private double radius;
//using getter and setter for data member
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
//creating constructor for the circle class
public void Circle() {
	this.radius=radius;
}
//method for calculating circumference using radius
public double CalculateCircumference() {
	return 2*Math.PI*this.radius;
}
	public static void main(String[] args) {
		Circle cc = new Circle();
		//here setting the value for radius as 6
		cc.setRadius(6);
		System.out.println("Circumference of Circle1: "+cc.CalculateCircumference());
	}

}
