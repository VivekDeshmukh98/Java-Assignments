package pack2;

import pack1.Student;

public class teststudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		Batch b1 = new Batch();
		
		s1.acceptInfo();
		s1.rollNo =201;				//public variable of Student class is accessible HERE
		s1.displayInfo();
		
		
		b1.acceptBatchInfo();
//		b1.batchName ='E';			//private variable of Batch class is not accessible here
		b1.displayBatchInfo();
	}

}

