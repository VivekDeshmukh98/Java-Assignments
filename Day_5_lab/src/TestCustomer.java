import java.util.Scanner;
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1=new Customer();
		cust1.display();
		Customer cust2=new Customer();
		cust2.display();
		cust2.getdetails();
		cust2.setCreditLimit(1200000);
		cust2.display();
		
	}

}
