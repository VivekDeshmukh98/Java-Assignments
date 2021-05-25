import java.util.Scanner;
public class Indexofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        
        System.out.println("Enter a number to be searched in an array:");
        int n=sc.nextInt();
        
        
        boolean flag=true;
        for(int i=0;i<arr.length;i++) 
        	if(n==arr[i]) {
        		System.out.println("index of "+n+" is "+i);
        		flag=false;
        	}
        	if(flag==true) {
        		System.out.println("number does not exist in an array");
        	}		
        	sc.close();
        	}
}
	


