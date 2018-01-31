
/*
 * Emily Blanford
 * Lab 8 - Batting Statistics
 * 1/31/2018
 */

import java.util.Scanner;

public class Lab8 {
	public static void main(String[] args) {
		// Declare Variables
		Scanner scan = new Scanner(System.in);
		String cont = "y";

		// Greeting
		System.out.println("Welcome to Batting Average Calculator!");

		while (cont.equalsIgnoreCase("y")) {
			// Get a positive user integer for number of bats
			int numBats = Validator.getInt(scan, "\nEnter number of times at bat: ", 0);

			// Initialize a new array for your batting results and counters
			int[] batResults = new int[numBats];
			double goodBat = 0.0;
			double bases = 0.0;

			// Collect batting results
			System.out.println("\n0=out, 1=single, 2=double, 3=triple, 4=home run");
			for (int i = 0; i < batResults.length; i++) {
				batResults[i] = Validator.getInt(scan, "Result for at-bat " + i + ": ", 0, 4);
				if (batResults[i] > 0) {
					goodBat++;
					bases += batResults[i];
				}
			}
			
			// Output
			System.out.printf("\nBatting average: %.3f", (goodBat / numBats));
			System.out.printf("\nSlugging Percentage: %.3f", (bases / numBats));

			// Go again?
			cont = Validator.getString(scan, "\n\nAnother Batter? (y/n): ", "y", "n");
			
		}
		
		System.out.println("Goodbye.");
		scan.close();
	}

}
