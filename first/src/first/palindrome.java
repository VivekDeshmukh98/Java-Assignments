package first;
import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterr a number:");
		int n= sc.nextInt();
		int OriginalNo=n,sum=0;
		
		while(n>0) {
			int lastdigit=n%10;
			sum=sum*10+lastdigit;
			n/=10;
		}
		if(OriginalNo==sum) {
			System.out.println(OriginalNo+" is palindrome");
		}
		else {
			System.out.println(OriginalNo+" is not palindrome");
		}
		sc.close();
	}

}
