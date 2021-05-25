package first;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			int n=sc.nextInt();

			
			int evensum=0;
			int oddsum = 0;
			for(int i=1;i<=n;i++) {
				if(i%2==0)
					evensum+=i;
				else
					oddsum+=i;
				}
			System.out.println("Addition of even number from 1 to "+n+"is "+evensum);
			System.out.println("Addition of odd number from 1 to "+n+"is "+oddsum);
			sc.close();
		}
		

	}


