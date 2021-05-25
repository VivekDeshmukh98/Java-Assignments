package first;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
		
	}
	
	
}
