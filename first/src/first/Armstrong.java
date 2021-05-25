package first;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt(); 
		sc.close();
		int OriginalNum=n,sum=0,r;
		
		for(OriginalNum=n;n!=0;n=n/10) {
			r=n%10;
			sum=sum+(r*r*r);
		}
		if(sum==OriginalNum)
			System.out.println(OriginalNum+" is a Armstrong number.");
		else
			System.out.println(OriginalNum+" is not a Armstrong number.");
	}

}
