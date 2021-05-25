
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dob=new Date(10,9,1998);
		
		dob.display();
		dob.setDay(5);
		dob.setMonth(2);
		dob.setYear(1995);
		dob.display();
		System.out.println("---------3.2-------------");
		//calling default constructor
		Date dob2=new Date();
		dob2.display();
	}

}
