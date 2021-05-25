package first;
import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no1,no2,result;
		char c,d;
		int charresult;
		System.out.println("Enter value of no1:");
		no1=sc.nextInt();
		System.out.println("Enter value of no2:");
		no2=sc.nextInt();
		result=no1+no2;
		System.out.println("Result="+result);
		//addition of two characters
		System.out.println("Enter first character:");
		c=sc.next().charAt(0);
		System.out.println("Enter second character:");
		d=sc.next().charAt(0);
		charresult=c+d;
		System.out.println("Result of character is:"+charresult);
		sc.close();
	}

}
