
//Write a program which read aaray of 5 elements and print reverse array.
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array:");
        for(int i=0;i<array.length;i++)
        {
            array[i]= sc.nextInt();
        }
        System.out.println("Array in reversed order:");
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
        sc.close();
    }    
}
