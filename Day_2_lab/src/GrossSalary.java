import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary of an employee");
		int Basic_salary=sc.nextInt();
		if(Basic_salary<=10000) {
			double HRA=Basic_salary*0.2;
			double DA=Basic_salary*0.8;
			double Gross_salary=(Basic_salary+HRA+DA);
			System.out.println("HRA= "+HRA);
			System.out.println("DA= "+DA);
			System.out.println("Gross Salary= "+Gross_salary);
			}
		else if(Basic_salary<=20000) {
			double HRA=Basic_salary*0.25;
			double DA=Basic_salary*0.9;
			double Gross_salary=(Basic_salary+HRA+DA);
			System.out.println("HRA= "+HRA);
			System.out.println("DA= "+DA);
			System.out.println("Gross Salary= "+Gross_salary);
			}
		else if(Basic_salary>20000) {
			double HRA=Basic_salary*0.4;
			double DA=Basic_salary*0.95;
			double Gross_salary=(Basic_salary+HRA+DA);
			System.out.println("HRA= "+HRA);
			System.out.println("DA= "+DA);
			System.out.println("Gross Salary= "+Gross_salary);
			}
		sc.close();
	}

}
