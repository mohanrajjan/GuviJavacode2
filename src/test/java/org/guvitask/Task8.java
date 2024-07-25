package org.guvitask;

import java.util.Scanner;

public class Task8 {
public void fourNum() {
int a=5, b=8, c=2, d=6;
int sum1 = a+b;//sum of the values of a and b
int sum2= c+d; //sum of the values of c and d
if(sum1>sum2) {
	System.out.println("The sum of a and b is greater than c and d");
}
else {
	System.out.println("The sum of c and d is greater than a and b");
}
	
}
	public void oddOrEven() {
		int k=6;// if int value divide by 2 then remainder is zero it is even num
		if(k%2==0) //%Modulo symbol represents remainder value.
		{
			System.out.println("The given int is even : "+k);
		}
		else {
			System.out.println("The given int is odd : "+k);
		}
	}	
	public void alphabets() {
		char i;// Alphabets are printed based on ASCII value
		// Each from A to Z contains some Ascii value by incrementing Ascii value it
		//will print the character from A to Z.
		for(i='A';i<='Z';i++) {
			System.out.print(i);
		}
	}
	public void Swap() {
		int k,a=4,b=6;
		k=a;// by using int k will swap the value of a&b
		a=b;//first a value is assigned to k & b value to a & k value to b
		b=k;//by this now a have the value of b(6) & b have the value of a(4)
		System.out.println("Print the value of a "+a );
		System.out.println("Print the value of a "+b);
		
	}
	public void findPrime() {
		//prime number divisible by 1 and itself
		int ty,count=0;
		ty=10;//prime num starts from 2 so initiated with 2 and it will check all value
		//till 13
		  for (int i = 2; i <=ty; i++) { if(ty%i==0) { count++; } }
		if(count==1) {
			System.out.println("This is  prime number");
		}
		else {
			System.out.println("This is not prime number");
	}
		}
	public void factorial() {
		// it will multiple with the series of numbers we given like 1*2=2, 2*3=6,6*4=24
		//24*5=120
		int num=5,count=1;
		for (int i = 1; i <=num; i++) {
			count=count*i;
		}
		System.out.println(count);
	}
	public static void numOfCharac() {
		String s="Guvi Geek";
		int num =s.length();
		System.out.println("The length of String is "+num);
	}
	
	public void seniorCetizen() {
		int age= 60;//we defining person with age 60 or above is consider as
		//senior citizen.
		if(age>59) {
			System.out.println("This person is senoir citizen & age is " +age);
		}
		else {
			System.out.println("This person is not senior citizen & age is " +age);
		}
	}
	public void print() {
		int num =10;
		for(int i=0;i<num;i++);
		{
			System.out.println("Welcome to Guvi");
		}
	}
	public void count() {
		int n=123456;
		int count=0;//Every we divide by 10 count will by increased from o to 
		// number of times divisible.
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("The number of digit is " +count);
	}
	public static void main(String[] args) {
		//Task8 d = new Task8();
		int num =10;
		for(int i=0;i<num;i++);
		{
			System.out.println("Welcome to Guvi");
		}
	}
	
}
