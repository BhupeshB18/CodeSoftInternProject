package test;

import java.util.Scanner;

public class CurrencyConverterClass {
	
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Define exchange rates (you can fetch these from an API in a real application)
	        double usdToEurRate = 0.85;
	        double usdToGbpRate = 0.72;
	        double eurToGbpRate = 0.85 / 0.72; // Calculate EUR to GBP rate based on the other two rates

	        System.out.println("Welcome to Currency Converter!");
	        System.out.print("Enter the amount to convert: ");
	        double amount = scanner.nextDouble();

	        System.out.println("Select base currency:");
	        System.out.println("1. USD (US Dollar)");
	        System.out.println("2. EUR (Euro)");
	        System.out.println("3. GBP (British Pound)");
	        int baseChoice = scanner.nextInt();

	        System.out.println("Select target currency:");
	        System.out.println("1. USD (US Dollar)");
	        System.out.println("2. EUR (Euro)");
	        System.out.println("3. GBP (British Pound)");
	        int targetChoice = scanner.nextInt();

	        double result = 0.0;

	        if (baseChoice == 1 && targetChoice == 2) {
	            result = amount * usdToEurRate;
	        } else if (baseChoice == 1 && targetChoice == 3) {
	            result = amount * usdToGbpRate;
	        } else if (baseChoice == 2 && targetChoice == 1) {
	            result = amount / usdToEurRate;
	        } else if (baseChoice == 2 && targetChoice == 3) {
	            result = amount * eurToGbpRate;
	        } else if (baseChoice == 3 && targetChoice == 1) {
	            result = amount / usdToGbpRate;
	        } else if (baseChoice == 3 && targetChoice == 2) {
	            result = amount / eurToGbpRate;
	        } else {
	            result = amount; // Same currency, no conversion needed
	        }

	        System.out.println("Converted amount: " + result);

	        scanner.close();
	    }
	}

	


