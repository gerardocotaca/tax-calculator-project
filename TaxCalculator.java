import java.util.Scanner;


public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lets declare our variables
		double grossIncome, deduction, netIncome, federalTax, stateTax, finalTax; 
		
		char filingStatus;
		
		//Opening our scanner
		Scanner scanner = new Scanner(System.in);
		
		//Header prompt
		
		System.out.println("Income Tax Calculator");
		//Line spacing for clean code
		System.out.println();
		
		System.out.println("This program will calculate your income tax.");
		//Line spacing for clean code
		System.out.println();
		
		//Asking user for gross income
		
		System.out.print("What is your gross income?");
		
		grossIncome = Double.parseDouble(scanner.nextLine());
		//Line spacing for clean code
		System.out.println();
		
		//Writing down the list of the filing status options given
		
		System.out.println("FILING STATUS.");
		
		System.out.println("Single - SG");
		System.out.println("Married Joint - MJ");
		System.out.println("Married Separately - TN");
		System.out.println("Head of Household - H");
		
		//Ask user for their filing status
		
		System.out.print("Enter the two-letter code corresponding to your status: ");
		
		filingStatus = scanner.nextLine().charAt(0);
		///Line spacing for clean code
		System.out.println();
		
		//Calculating the deductions based on filing status indicated
		
		switch(filingStatus)
		{
		case 'S','G': deduction = 5950;
		break;
		case 'M','J': deduction = 11900;
		break; 
		case 'T','N': deduction = 5950;
		break;
		case 'H': deduction = 8700;
		break;
		default: deduction = 0;
		}
		
		//Calculating net income
		
		netIncome = grossIncome - deduction;
		
		//Calculating federal tax based on net income
		
		if(netIncome < 30000)
		{
			federalTax = 0;
		}
		else if(netIncome < 60000)
		{
			federalTax = netIncome * 0.1;
		}
		else if(netIncome < 100000)
		{
			federalTax = netIncome * 0.2;
		}
		else if(netIncome < 250000)
		{
			federalTax = netIncome * 0.3;
		}
		else 
		{
			federalTax = netIncome * 0.4;
		}
		
		//Calculating state tax
		
		stateTax = netIncome * 0.025;
		
		//Calculating final tax
		
		finalTax = federalTax + stateTax;
		
		//Writing indicated income 
		
		System.out.printf("Your stated income was $%.2f.\n", grossIncome);
		
		//Writing final tax liability
		
		System.out.printf("Your final tax liability is $%.2f.\n", finalTax);
		
		//Closing the scanner
		
		scanner.close();
	}

}
