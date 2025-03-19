import java.util.Scanner;

public class Factorial{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);

		int factorial = 1;
		int loops = 0;
		System.out.print("Enter number to get the factorial: ");
		int number = input.nextInt();

		for(loops = 0; loops <= number; loops++){
			number -= 1;
			factorial = factoria;l - loops;

		}
			//factorial *= number - 1;
			System.out.printf("%nThe factorials of %d is = %d%n ",number, factorial);
	}
}