import java.util.Scanner;
public class AccumulatedValue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter investment amount: ");
		double investmentAmount = input.nextDouble();

		System.out.println("Enter annual rate: ");
		double annualRate = input.nextDouble();

		System.out.println("Enter number of years: ");
		double years = input.nextDouble();

		double accumulatedValue = investmentAmount * ( 1 + annualRate ) ** years;

		System.out.println(accumulatedValue);






	}





}