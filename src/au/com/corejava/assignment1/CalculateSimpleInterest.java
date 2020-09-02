package au.com.corejava.assignment1;

public class CalculateSimpleInterest {

	public static void main(String[] args) {

		double principal = 6000.00;
		float interestRate = 10;
		double time = 1.5;

		System.out.println("Calculating the interest for \n Principal: " + principal + "\n interest rate : "
				+ interestRate + " \n time: " + time);

		// principal+interest=principal+prt
		interestRate = interestRate / 100;
		double interest = principal * interestRate * time;

		System.out.println("interest on principal " + principal + " is: " + interest);

	}

}
