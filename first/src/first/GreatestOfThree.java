package first;
import java.util.Scanner;
public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		System.out.println("Enter third number:");
		int c=sc.nextInt();
		
		
		if(a>=b)
			if(a>=c)
				System.out.println("Greatest number is "+a);
			else 
				System.out.println("Greatest number is "+c);
		else if(b>=a)
			if(b>=c)
				System.out.println("Greatest number is "+b);
			else
				System.out.println("Greatest number is "+c);
		sc.close();

	}
	

}
