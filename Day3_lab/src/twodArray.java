import java.util.Scanner;
public class twodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] array=new int[3][3];
		System.out.println("Enter Array elements");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+array[i][j]);
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
