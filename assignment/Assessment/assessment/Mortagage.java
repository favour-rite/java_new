import java.util.Scanner;
public class Mortgage{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter principal amount ");
	double principalAmount = input.nextDouble();
	System.out.print("Enter intrest rate ");
	double rate = input.nextDouble();
	System.out.print("Enter duration ");
	double duration = input.nextDouble();

	double monthlyRate = rate / 100 / 12;
	double numberOfMonths = duration * 12;

	double numerator = monthlyRate *  Math.pow ((1 + monthlyRate ),(numberOfMonths));
	double denominator =Math.pow((1 + monthlyRate ),(numberOfMonths)) - 1;
	
	double monthlyPayment = principalAmount * (numerator / denominator );
	System.out.printf("Your monthlyPayment is " + monthlyPayment );
	
	}


}