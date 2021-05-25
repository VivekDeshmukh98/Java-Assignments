import java.util.Scanner;
public class Date {
		private int Day;
		private int Month;
		private int Year;
		
		
		public void acceptInfo() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Day:");
			this.Day=sc.nextInt();
			System.out.println("Month");
			this.Month=sc.nextInt();
			System.out.println("Year:");
			this.Year=sc.nextInt();
			
		}
		
		public void displayInfo() {
			System.out.println("Day: "+this.Day);
			System.out.println("Month: "+this.Month);
			System.out.println("Year: "+this.Year);
		}
	}


