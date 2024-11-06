package org.controlStatement;

import java.util.Scanner;

public class ControlSS {

	public void palindrome() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = s.next();
		StringBuffer ss = new StringBuffer(str1);
		StringBuffer str2 = ss.reverse();
		String str3=str2.toString();
		System.out.println("Reverse String "+str3);
		if(str1.equals(str3)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}
					
	}
	public void reveString() {
	
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
	
	public void sandTri() {
		int n=2,a,b,c;
		for( a=0;a<=n-1;a++) {
			
			for(b=0;b<a;b++) {
				System.out.print(" ");
			}
			for(c=a;c<=n-1;c++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(a=n-2;a>=0;a--) {
			for(b=0;b<a;b++) {
				System.out.print(" ");
			}
			for(c=a;c<=n-1;c++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	public void grade() {
		int n = 78;
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
	public void hotelTariif() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month, Rent in float and no of days");
		int m=sc.nextInt();
		float rent=sc.nextFloat();
		int days=sc.nextInt();
		
		if(m==4||m==5||m==6||m==11||m==12) {
			double d=1.20*rent;
			double e=d*days;
			System.out.printf("Hotel tariff:Rs "+e);
	}else if(m>12){
		System.out.println("Invalid Input");
	}
	else {
		float n=rent*days;
		System.out.printf("Hotel tariff:Rs "+n);
	}
	}
	public void large() {
		int a=10,b=45,c=40;
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
		ControlSS pp = new ControlSS();
		//pp.palindrome();
		//pp.reveString();
		//pp.rtri();
		//pp.grade();
		pp.sandTri();
		//pp.large();
		//pp.hotelTariif();
	}
}
