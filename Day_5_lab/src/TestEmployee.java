
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		Employee[] allEmps=new Employee[5];
		Employee emp1=new Employee(101,"VIVEK", "pune",10000);
		Employee emp2=new Employee(102,"Raj", "ngp",20000);
		Employee emp3=new Employee(103,"rahul", "bhnadara",30000);
		Employee emp4=new Employee(104,"darshan", "wardha",40000);
	    Employee emp5=new Employee(105,"harshit", "warthi",50000);
	    
	    allEmps[0]=emp1;
	    allEmps[1]=emp2;
	    allEmps[2]=emp3;
	    allEmps[3]=emp4;
	    allEmps[4]=emp5;
	    
	    System.out.println("----------------");
	    
	    for(int i=0;i<arr.length;i++) {
	    	allEmps[i].displayInfo();
	    }
	    
	    System.out.println("---------Displaying using For each Loop----------");
	    for(Employee emp:allEmps) {
	    	emp.displayInfo();
	    }
	    		
	    System.out.println("----------------2.3-----------------");
	    System.out.println("show those employee who are getting salary >20000.");
	    for(int i=0;i<arr.length;i++) {
	    	if(allEmps[i].getSalary()>20000) {
	    		System.out.println(allEmps[i].getName()+" "+allEmps[i].getSalary());
	    	}
	    	
	    }
	    
	    
	    
	    
	    
	    
	    }
	    }
	    
	
	

