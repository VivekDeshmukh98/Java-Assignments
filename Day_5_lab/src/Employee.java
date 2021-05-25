import java.util.Scanner;
public class Employee {
	private int empid;
	private String name;
	private String address;
	private int salary;
	
	//Parameterized constructor
	Employee(int id, String nm, String addr, int sal) {
        this.empid = id;
        this.name = nm;
        this.address = addr;
        this.salary = sal;
    }
	
	public void displayInfo() {
		System.out.println("Emp id.: "+empid);
		System.out.println("name: "+name);
		System.out.println("address: "+address);
		System.out.println("salary: "+salary);
		System.out.println("-------------------------------");
		
	}	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
