package com.arrayscanner;

import java.util.Scanner;

public class Employee {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how much employees information you want");
        int size=sc.nextInt();
		
		Employee[]empArr=new Employee[size];
		Employee emp=null;
		
		for(int i=0;i<empArr.length;i++) {
		System.out.println("EnterEmployee Information!!!");
		
		
		
		System.out.println("=======================================================================");
		
		System.out.println("Enter Employee id:");
		int id=sc.nextInt();
		System.out.println("-------------------------------------------------------------------------");
		
		
		
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		System.out.println("-------------------------------------------------------------------------");
		
		
		System.out.println("Enter Employee Basic Salary:");
		int bsal=sc.nextInt();
		System.out.println("-------------------------------------------------------------------------");
		
		
		System.out.println("Enter Employee Home Rent Allowance:");
		int hra=sc.nextInt();
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println("Enter Employee DA:");
		int da=sc.nextInt();
		System.out.println("-------------------------------------------------------------------------");
		
		emp=new Employee();
				empArr[i]=emp;
		}
		
		for(Employee e:empArr)
		{
			System.out.println(e);
		}
	}
	

}
