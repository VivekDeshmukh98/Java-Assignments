package first;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,flag=0;
		System.out.println("Enter value of n:");
		num=sc.nextInt();
		
		for(int i=2;i< num/2;i++) { 
		if(num%i == 0) {
			System.out.println(num+" is not prime number");
			flag = 1;
			break;
		}
	}
		if(flag == 0) {
			System.out.println(num+" is a prime number");
		}
	sc.close();
	}
	
}

