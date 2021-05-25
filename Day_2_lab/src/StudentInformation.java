import java.util.Scanner;

public class StudentInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter roll no.:");
		int rollno=sc.nextInt();
		System.out.println("Enter the 5 subjects marks:");
		int[] marks=new int[5];
		int total=0;
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		
		for(int i=0;i<marks.length;i++) {
			total=total+marks[i];
		}
		System.out.println(total);
		int percentage=(total*100)/500;
		System.out.println("Percentage of student is "+percentage);
		if(percentage>75) {
			System.out.println("Grade A");
		}
		else if(percentage<74 && percentage>60) {
			System.out.println("Grade B");
		}
		else
			System.out.println("Grade C");
	    sc.close();
	}
	

}
