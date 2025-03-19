import java.util.Scanner;

public class CompoundInterestCalculator {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String args[]) {

		double principal = getInitialInvestment();
		double monthlyContribution = getMonthlyContribution();
		int years = getNumberOfYears();
		double annualRate = getAnnualRate();
		double convertedAnnualRate = annualRate / 100;
		double rangeVariance = getInterestRateVariance();
		int compoundFrequency = getCompoundFrequency();
		int frequency = getFrequency(compoundFrequency);

		double futureValue = calculateCompoundInterest(principal, convertedAnnualRate, monthlyContribution, compoundFrequency, years, frequency);
		System.out.printf("The compound interest value is %,.2f%n", futureValue);
	}

	public static double getInitialInvestment() {
		System.out.print("Initial Investment: ");
		return userInput.nextDouble();
	}


	public static double getMonthlyContribution() {
		System.out.print("Enter monthly contribution: ");
		return userInput.nextDouble();
	}

	public static int getNumberOfYears() {
		System.out.print("Enter number of years: ");
		return userInput.nextInt();
	}


	public static double getAnnualRate() {
		System.out.print("Enter interest rate in percentage (e.g., 5%): ");
		return userInput.nextDouble();
	}


	public static double getInterestRateVariance() {
		System.out.print("Enter interest rate variance range: ");
		return userInput.nextDouble();
	}


	public static int getCompoundFrequency() {
		System.out.print("For compound frequency, 1 for daily or 2 for monthly: ");
		return userInput.nextInt();
	}

	public static int getFrequency(int compoundFrequency) {

		if (compoundFrequency == 1) {
			return 365;
		} else if (compoundFrequency == 2) {
			return 12;
		} else {
			System.out.println("Invalid input for compound frequency. Defaulting to monthly (12).");
			return 0;
		}
	}


	public static double calculateCompoundInterest(double principal, double convertedAnnualRate, double monthlyContribution, int compoundFrequency, int years, int frequency) {

		double futureValueOfInitialInvestment = principal * Math.pow(1 + (convertedAnnualRate / frequency), frequency * years);


		double step1 = Math.pow(1 + (convertedAnnualRate / frequency), frequency * years) - 1;
		double step2 = (convertedAnnualRate / frequency);
		double futureValueOfMonthlyContributions = monthlyContribution * (step1 / step2);


		return futureValueOfInitialInvestment + futureValueOfMonthlyContributions;
	}

}