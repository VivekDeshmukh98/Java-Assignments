//Create a java application for the following.
// Create a Customer class , with data members (all private : tight encapsulation)
//name(String),email(String),age(int), creditLimit(double)
//
//2.1 Write acceptInfo() method to accept customer details:
//
//2.2 Write a method , showDetails to display customer name & credit limit only.
//
//Naming convention : public void setCreditLimit(double limit) {...}
//public double getCreditLimit(){...}
//
//2.3 Create a TestCustomer class . Use scanner to accept user i/ps.
//Create 2 customers object.
//Display customer details of both customers.
//Prompt user , for changing creditLimit of the customer2.
//Display new credit limit on the console.

import java.util.Scanner;
public class Customer {
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	
	public void acceptInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		this.name=sc.next();
		System.out.println("Enter email:");
		this.email=sc.next();
		System.out.println("Enter age:");
		this.age=sc.nextInt();
		System.out.println("Enter credit limit");
		this.creditLimit=sc.nextDouble();
	}
	public void setCreditLimit(double newCredit) {
		creditLimit=newCredit;
	}
	
	public double getCreditlimit() {
		return creditLimit;
	}
	
	
	public void displayInfo() {
		System.out.println("Name: "+this.name);
		System.out.println("Email: "+this.email);
		System.out.println("Age: "+this.age);
		System.out.println("Credit Limit: "+this.creditLimit);
	}
}
