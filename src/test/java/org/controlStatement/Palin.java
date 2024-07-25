package org.controlStatement;

import java.util.Scanner;

public class Palin {

	public void palindrome() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = s.next();
		StringBuffer ss = new StringBuffer(str1);
		String str2 = ss.toString();
		System.out.println("Reverse String "+str2);
		if(str1.equals(str2)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}
					
	}
	public void reve() {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = s.next();
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	}
	
	public void rtri() {
		int count=1;
		for(int i=1;i<5;i++) {
		
			for(int j=1;j<=i;j++) 
			{
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}
	}
	
	public void starTri() {
		int n=2;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=1;j--) {
				System.out.print(" ");
			}
			for(int k=i;k<=n;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void grade() {
		int n = 49;
		if(n>100) {
			System.out.println("Invalid Input");
		}
		else if(n==100) {
			System.out.println("S grade");
		}
		else if(99 >= n && n >= 90) 
		{ System.out.println("A grade");
		} 
		else if (89 >= n && n >= 80) 
		{ System.out.println("B grade");
		} 
		else if (79 >= n && n >= 70) {
			System.out.println("C grade");
		} 
		else if (69 >= n && n >= 60) 
		{ System.out.println("D grade");
		}
		else if (59 >= n && n >= 50) {
		System.out.println("E grade");
		}
		else if(n <= 50) {
			System.out.println("Fail");
		}
	}
	public void month() {
		
	}
	public void large() {
		int a=10,b=40,c=45;
		if(a>b && a>c)
		{
			System.out.println("A is the largest value: " +a);
		}
		else if(b>a && b>c) {
			System.out.println("B is the larest value: " + b);
		}
		else {
			System.out.println("C is the largest value: " + c);
		}
	}
	public static void main(String[] args) {
		Palin pp = new Palin();
		//pp.palindrome();
		//pp.reve();
		//pp.rtri();
		//pp.grade();
		//pp.starTri();
		pp.large();
	}
}
