import java.util.Arrays;
import java.util.Scanner;
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] array1=new int[5];
		System.out.println("Enter the elements of first Array:");
		
		for(int i=0;i<array1.length;i++) {
				array1[i]=sc.nextInt();
			}
		int[] array2=new int[5];
		System.out.println("Enter the elements of second Array:");
		
		for(int i=0;i<array2.length;i++) {
				array2[i]=sc.nextInt();
			}
		
		
		int[] array3=new int[array1.length+array2.length];
		int i=0;
		for (int element : array1) {
            array3[i] = element;
            i++;
        }

        for (int element : array2) {
            array3[i] = element;
            i++;
        }
        for(int i1=0;i1<array3.length;i1++)
        System.out.print(" "+array3[i1]);	
	}
	
}


