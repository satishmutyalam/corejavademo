package au.com.corejava.assignment2;

import java.util.Scanner;

public class FindProfitOrLoss {

	public static void main(String[] args) {

		System.out.println("Enter cost price and selling price to calculate the logic for Profit or Loss");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter cost price");

		float costPrice = scanner.nextFloat();

		System.out.println("Enter selling price");

		float sellingPrice = scanner.nextFloat();

		if (sellingPrice > costPrice) {
			System.out.println("customer made profit of " + (sellingPrice - costPrice));
		} else if (sellingPrice < costPrice) {
			System.out.println("customer made loss of " + (costPrice - sellingPrice));
		} else {
			System.out.println("customer didn't made any loss or profit");
		}

		scanner.close();
	}

}
