
public class FunctionOverloading {
	public static void addition(int no1,int no2) {

        System.out.println("Add=" + (no1 + no2));
    }
    public static void addition(int no1,int no2,int no3){
        System.out.println("Add=" + (no1 + no2 + no3));
        }
    public static void addition(double no1,int no2,int no3){
        System.out.println("Add=" + (no1 + no2 + no3));
    }
    public static void addition(String no1,String no2){
        System.out.println("Add=" + (no1 + no2));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=40,c=24;
        double d= 23.09;
        addition(a,b);
        addition(a,b,c);
        addition(d,a,b);
        addition("hello","hello");
    }
    

	}

