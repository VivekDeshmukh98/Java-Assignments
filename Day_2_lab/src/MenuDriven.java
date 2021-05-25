import java.util.Scanner;
	
public class MenuDriven {
	
public static void main(String[] args) {
	// TODO Auto-generated method stub

		int n;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
	   
		System.out.println("1. pen");
		System.out.println("2. pencil");
		System.out.println("3. notebook");
		System.out.println("4. bottle");
		System.out.println("5. colourBox");
		System.out.println("6. exit");
		int gt=0,tot1=0,tot2=0,tot3=0,tot4=0,tot5=0,n1;
	
	     while(flag!=true)
	     {
    	 System.out.println("enter a choice");
    	 n=sc.nextInt();

    	 switch(n)
    	 {
 
	    	 case 1:
		 System.out.println("pen, price=10 RS ");
		 System.out.println("Enter quantity of product:");
		 n1=sc.nextInt();
		 tot1=n1*10;
		 System.out.println("Toata="+tot1);
		 
		 break;
		 
		 case 2:
		 
		 System.out.println("pencil, price=5 RS");
		 n1=sc.nextInt();
		 tot2=n1*5;
		 System.out.println("Toata="+tot2);
		 break;
		 
	     case 3:
	     
	    System.out.println("Notebook, price=20");
	    n1=sc.nextInt();
	    tot3=n1*20;
	    break;
	     
	     case 4:
	     
	    System.out.println("bottle, price=30");
	    n1=sc.nextInt();
	    tot4=n1*30;
	    break;
	     
	     case 5:
	     
	    System.out.println("colourbox, price=50");
	    n1=sc.nextInt();
	    tot5=n1*50;
	         break;
	
	     case 6:
	     
	    flag=true;
	    System.out.println("Terminating the app and calculating grandtotal..");
	    break;
	   
	     
	     }
	}
	     gt=tot1+tot2+tot3+tot4+tot5;
	     System.out.println("total price of all product="+gt);
	     sc.close();
	}
	}