
import java.util.Scanner;
public class CompoundIntrestCalculator
{
	static Scanner userInput = new Scanner(System.in);

	public static void main(String args []){
		
			System.out.println("Intial Investment");
			double principal = userInput.nextDouble();

			System.out.print(" Enter monthly contribution: ");
			double monthlyContribution = userInput.nextDouble();
		
			System.out.print(" Enter number of years: ");
			int years = userInput.nextInt();

			System.out.print(" Enter interest rate in percentage(eg 5%): ");
			double annualRate = userInput.nextDouble();
			double convertedAnnualRate = annualRate / 100;
	
			System.out.print(" Enter intrest rate variance range: ");
			double rangeVariance = userInput.nextDouble();

			System.out.print(" For compound frequency 1 for daily or 2 for monthly: ");
			int compoundFrequency = userInput.nextInt();
			
			int frequency = 0;
			if(compoundFrequency == 1) frequency = 365;
			else if(compoundFrequency == 2) frequency = 12;
			else System.out.print("Do validation");
			
			 System.out.printf("The compound is %,.2f", CompoundInterest(principal,convertedAnnualRate,monthlyContribution,compoundFrequency,years,frequency));
	
	}				
		
			
    

	public static double CompoundInterest(double principal,double convertedAnnualRate,double monthlyContribution,double compoundFrequency,int years,int frequency){

			double futureValueOfIntialInvestment = principal * Math.pow(1 + (convertedAnnualRate /  frequency),  frequency * years);

			double step1 = (Math.pow(1 + (convertedAnnualRate /  frequency),frequency * years))-1 ;
			double step2 = 	 (convertedAnnualRate / frequency);
			double futureValueOfMonthlyContributions = monthlyContribution * (step1/step2);


			return futureValueOfIntialInvestment + futureValueOfMonthlyContributions;
	

	}
		

				
		

}



			
		
		


