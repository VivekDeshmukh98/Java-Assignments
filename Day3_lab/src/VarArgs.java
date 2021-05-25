
public class VarArgs {
	public static void add(int... a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Sum of "+a.length+" elements: "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=20;
			add();
			add(a);
			add(a,a,a,a,a,a,a);
			add(20,30,40,80);
	}

}
