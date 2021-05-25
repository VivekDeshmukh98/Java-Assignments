package first;
import java.util.Scanner;
public class SumFrom1ton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			sum+=i;
		
		}
		System.out.println("Addition from 1 to "+n+" is "+sum);
		sc.close();
	}
	

}
