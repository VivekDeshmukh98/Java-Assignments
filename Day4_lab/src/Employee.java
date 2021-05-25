import java.util.Scanner;
public class Employee {
	private int EmployeeId;
	private String Name;
	private double BasicSalary;
	private double HRA;//.
	private double Medical;
	private double PF;//.
	private double PT;///
	private double NetSalary;////.
	private double GrossSalary;/////.
	
	public void acceptInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Employee ID:");
		this.EmployeeId=sc.nextInt();
		System.out.println("Enter name of an Employee:");
		this.Name=sc.next();
		System.out.println("Enter Salary of an Employee:");
		this.BasicSalary=sc.nextDouble();
	}
	
	private void Calculations(){
		HRA=BasicSalary*0.5;
		System.out.println("HRA of an Employee is: "+HRA);
		PF=BasicSalary*0.12;
		System.out.println("PF of an Employee is :"+PF);
		Medical=500;
		System.out.println("Medical of an Employee is :"+Medical);
		PT=200;
		System.out.println("PT of an Employee is :"+PT);
	}
	
	public void displayInfo() {
		System.out.println("EmployeeID: "+this.EmployeeId);
		System.out.println("Name: "+this.Name);
		System.out.println("Basic Salary: "+BasicSalary);
		this.Calculations();
		GrossSalary=(BasicSalary+HRA+Medical);
		System.out.println("Gross Salary of an employee is"+GrossSalary);
		NetSalary=(GrossSalary-(PT+PF));
		System.out.println("Net Salary= "+NetSalary);
				
	}
	
	
}
