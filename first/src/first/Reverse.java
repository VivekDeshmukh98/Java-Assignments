package first;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		sc.close();
		int OriginalNo=n,reverse=0;
		while(n>0) {
			int lastdigit=n%10;
			reverse=reverse*10+lastdigit;
			n/=10;
		}
		System.out.println("Reverse number of "+OriginalNo+" is "+reverse);
	}

}
