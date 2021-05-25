package first;
import java.util.Scanner;
public class PowerofMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int m,n;
		System.out.println("Enter the value of m");
		m=sc.nextInt();
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		
		System.out.println(""+m+"^"+n+" : "+Math.pow(m, n));
		sc.close();
	}

}
