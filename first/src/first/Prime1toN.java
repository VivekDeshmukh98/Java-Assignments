package first;
import java.util.Scanner;
public class Prime1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		int counter;
		System.out.print("Prime numbers from 1 to "+n+" : ");
		for(int j=2;j<=n;j++)
		{
			counter=0;
			for(int i=2;i<=j;i++)
				if(j%i==0)
						counter++;
			if(counter==1)
				System.out.print(j+"  ");
		}
			}
		}
	


