import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter elements of array:");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<5;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Maximum no. in an array is :"+max);
	
		int min=arr[0];
		for(int i=0;i<5;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum no. in an array is :"+min);
		sc.close();

}
}
