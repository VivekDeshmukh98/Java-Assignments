
public class Customer {
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	//Default Constructor
	public Customer(){
		this.name="Riya";
		this.email="riya@gmail.com";
		this.age=25;
		this.creditLimit=10000;
	}
	
	//Parameterized Constructor
	public Customer(String name,String email,int age,double creditLimit){
		this();
		this.name=name;
		this.age=age;
		this.email=email;
		this.creditLimit=creditLimit;
	}
	
	
	public void display() {
		System.out.println("Name:"+this.name+" Email: "+this.email+" Age: "+this.age+" credit limit: "+creditLimit);
	}

	
	///4.3 Method,getdetails
	
	
	public void getdetails() {
		String s=String.valueOf(creditLimit);
		String name=this.name;
		System.out.println("CreditLimit in String: "+s+" Name: "+name);
	}
	


	/////4.4
	public void setcreditLimit(double newCredit) {
		creditLimit=newCredit;
	}
	
	public double getcreditLimit() {
		return creditLimit;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//Getter And Setter
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
}
