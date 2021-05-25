import java.util.Arrays;
import java.util.Scanner;
public class SortingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] arr1=new int[5];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
//		Arrays.sort(arr1);
		  
		for (int i = 0; i < arr1.length; i++)   
		{  
		for (int j = i + 1; j < arr1.length; j++)   
		{  
		int tmp = 0;  
		if (arr1[i] > arr1[j])   
		{  
		tmp = arr1[i];  
		arr1[i] = arr1[j];  
		arr1[j] = tmp;  
		}  
		}  
		
		System.out.println(arr1[i]);  
	sc.close();
	}
	}
}


