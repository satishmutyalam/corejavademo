package au.com.corejava.assignment1;

import java.util.Scanner;

public class CalculateCubeOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter number to calculate cube");

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		int cubeOfNumber = num * num * num;

		System.out.println("Cube of " + num + " is: " + cubeOfNumber);

		scanner.close();

	}

}
