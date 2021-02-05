package com.ilomaemployee;

import java.util.Scanner;

public class EmployeeInfo {
	public String company;
	public String name;
	public String designation;
	public String id;
	private String info;
	private double calc_salary;
	private String salary_permission;
	private double ctc;
	
	// public EmployeeInfo display;

	// constructor
	public EmployeeInfo() {
		company = "Iloma";
		name = "default";
		designation = "None";
		id = "1";
	}

	public EmployeeInfo(String c, String n, String d, String i) {
		company = c;
		name = n;
		designation = d;
		id = "i";
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	public void setCalc_salary(double CTC) {
		this.ctc=CTC;
		double income_tax=ctc*0.1;
		double provident_fund=ctc*0.08;
		double professional_tax=ctc*0.05;
		double basic_salary=ctc-(income_tax+provident_fund+professional_tax);
		
		System.out.println("Your salary Details: " +"IncomeTax: "+income_tax+ " Provident_Fund " +provident_fund+ " Professional_Tax "+ professional_tax +" Basic_salary: "+ basic_salary);	
	}
	public void setSalary_permission(String choice){
		Scanner sc=new Scanner(System.in);
		if(choice.equals("y")|| choice.equals("Y")) {
			System.out.println("Enter your CTC: ");
			double ctc=sc.nextDouble();
			setCalc_salary(ctc);
			
		}
		else {
			System.out.println("Thankyou");
		}
		
		
	}
	public double getCalc_salary() {
		return calc_salary;
	}

	/*
	 * public void setDisplay(String c,String n,String d,int i) { this.company=c;
	 * this.name=n; this.designation=d; this.id=i; } public EmployeeInfo
	 * getDisplay() { return display; }
	 */
	/*private String setDepartment() {
		System.out.println("DEPARTMENT CODES: \n 1 for Android \n 2 for IOS \n3 for QA \n4 for web \n 5 forNone");
		System.out.println("Enter Department code: ");
		Scanner in = new Scanner(System.in);
		int deptchoice = in.nextInt();
		if (deptchoice == 1) {
			return "Android Developer";

		} else if (deptchoice == 2) {
			return "IOS Developer";
		} else if (deptchoice == 3) {
			return " QA";
		} else if (deptchoice == 4) {
			return "Web Developer";
		} else {
			return "";
		}

	}*/
	public  void setInfo(String ch) {
		
		if(ch.equals("y") || ch.equals("Y")) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=s.next();
		setName(name);
		System.out.println("Enter your Company: ");
		String comp=s.next();
		setCompany(comp);
		System.out.println("Enter your Designation: ");
		String deg=s.next();
		setDesignation(deg);
		
		System.out.println("Enter your Id: ");
		String idd=s.next();
		
		setId(idd);
		}
		else {
			System.out.println("Thankyou");
		}
		
	


	/*public  int setInfo(char choice) {
		if(choice=="y" || choice=="Y") {
		System.out.println("Enter your name: ");
		
		}*/
	

	
	}
}
