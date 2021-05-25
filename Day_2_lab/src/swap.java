import java.util.Scanner;
public class swap {
 		// TODO Auto-generated method stub
		public static void swap(int no1,int no2){
	        int temp=no1;
	        no1=no2;
	        no2=temp;
	        System.out.println("After swap: a="+no1+" and b="+no2);

	    }

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int a,b;
	        System.out.println("Enter value of a:");
	        a=sc.nextInt();
	        System.out.println("Enter value of b:");
	        b= sc.nextInt();
	        swap(a,b);
	        sc.close();
	    }
	    
	    
	    
	}

