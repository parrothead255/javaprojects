
public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab04a, Student version\n");
		double principal = 250000;
		double annualRate = 4.85;
		double numYears = 30;
		double numMonths=numYears*12;
		double monthlyRate=(annualRate/12)/100;
		double numer=monthlyRate*(Math.pow((1+monthlyRate), numMonths));
		double denom=(Math.pow((1+monthlyRate), numMonths))-1;
		double monthlyPayment=numer/denom*principal;
		
		System.out.println("Principal:\t $"+principal);
		System.out.println("Annual Rate:\t "+annualRate+"%");
		System.out.println("Number of Years: "+numYears);
		System.out.println("Monthly Payment: "+monthlyPayment);
	}

}
