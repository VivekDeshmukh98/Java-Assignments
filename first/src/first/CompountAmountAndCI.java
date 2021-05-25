//Find the compound amount and compound interest on the principal Rs.20,000 borrowed at 6% compounded annually for 3 years.
package first;

public class CompountAmountAndCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principal=20000,time=3,n=12;
		double rate=0.06;
		double amount=principal * Math.pow(1 + (rate / n), n * time);
		double cinterest = amount - principal;
        System.out.println("Compound Interest after " + time + " years: "+cinterest);
        System.out.println("Amount after " + time + " years: "+amount);
	}

}
