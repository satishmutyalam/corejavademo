package au.com.corejava.assignment1;

import java.util.Scanner;

public class CalculateWeightOfPerson {

	public static void main(String[] args) {

		System.out.println("Enter weights of 5 persons");

		Scanner scanner = new Scanner(System.in);

		float w1 = scanner.nextFloat();
		float w2 = scanner.nextFloat();
		float w3 = scanner.nextFloat();
		float w4 = scanner.nextFloat();
		float w5 = scanner.nextFloat();

		float netWeight = w1 + w2 + w3 + w4 + w5;

		float averageWeight = netWeight / 5;

		System.out.println("Net Weight is:  " + netWeight + " Average Weight is: " + averageWeight);

		scanner.close();
	}

}
