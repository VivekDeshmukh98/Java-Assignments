import java.util.Scanner;

public class AdditionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] firstArray=new int[3][3];
		System.out.println("Enter first Array elements");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				firstArray[i][j]=sc.nextInt();
			}
		}
		
		int[][] secondArray 	=new int[3][3];
		System.out.println("Enter second Array elements");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				secondArray[i][j]=sc.nextInt();
			}
		}
		int[][] thirdArray =new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				thirdArray[i][j]=firstArray[i][j]+secondArray[i][j];
			}
		}
		System.out.println("Sum of two array is:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+thirdArray[i][j]);
			}
			System.out.println("");
		}
	sc.close();
	}
	

}
