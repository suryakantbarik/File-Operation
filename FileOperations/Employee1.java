package com.ilomaemployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EmployeeInfo emp1 = new EmployeeInfo();
		EmployeeInfo emp2 = new EmployeeInfo();
		EmployeeInfo emp3 = new EmployeeInfo();

		System.out.println("Do you want to enter your information y/n: ");
		String choice = sc.next();
		emp1.setInfo(choice);

		System.out.println("Do you want to continue y/n: ");
		String choice2 = sc.next();
		emp2.setInfo(choice2);
		
		System.out.println("Do you want enter salary info y/n: ");
		String choice3=sc.next();
		emp1.setSalary_permission(choice3);
		
		
		

		/*System.out.println("Do you want to continue y/n");
		String choice3 = sc.next();
		emp3.setInfo(choice3);*/
		
		
		ArrayList<EmployeeInfo> list=new ArrayList<EmployeeInfo>();
		list.add(emp1);
		list.add(emp2);
		
		
		for(EmployeeInfo e:list) {
			System.out.println("Name: " +  e.getName() + " Company: " +  e.getCompany()  +  " Designation: "  +  e.getDesignation()  + " ID: "+e.getId() );
		}
		
		
	}
}

