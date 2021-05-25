package pack1;


import java.util.Scanner;
public class Student {
	public int rollNo;
	public String name;
	private String grade;
	int totalMarks;
	
	public void acceptInfo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No.:");
		rollNo=sc.nextInt();
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter Grade:");
		grade=sc.next();
		System.out.println("Enter total marks:");
		totalMarks=sc.nextInt();	
	}
	
	public void displayInfo() {
		System.out.println("Roll No.: "+rollNo);
		System.out.println("name: "+name);
		System.out.println("grade: "+grade);
		System.out.println("total marks: "+totalMarks);
	}
	
	
	
}
