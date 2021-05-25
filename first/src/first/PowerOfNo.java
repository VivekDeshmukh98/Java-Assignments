package first;
import java.util.Scanner;
public class PowerOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base,exponent,power=1;
		System.out.println("Enter the value of base:");
		base=sc.nextInt();
		System.out.println("Enter the value of exponent:");
		exponent=sc.nextInt();
		for(int i=1;i<=exponent;i++) {
			power=power*base;
		}
		System.out.println("Power of no. is:"+power);
		sc.close();
	}
	

}
