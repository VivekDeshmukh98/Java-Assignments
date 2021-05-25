import java.util.Scanner;
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Customer Cust1=new Customer();
		Cust1.acceptInfo();
		Cust1.displayInfo();
		System.out.println("--------------------");
		Customer Cust2=new Customer();
		Cust2.acceptInfo();
		Cust2.displayInfo();
		System.out.println("Enter new Credit Limit: ");
		double c=sc.nextDouble();
		
		Cust2.setCreditLimit(c);
		Cust2.displayInfo();
	}

}
