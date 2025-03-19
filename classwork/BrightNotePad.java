import java.util.Scanner;

public class BrightNotePad{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		//System.out.println("Hi bright how are you doing");
		//System.out.println("just make me wet");
		//System.out.print("am fine handsome i guess we should ride on me tonight ");
		//System.out.println("baby go deeper");


		System.out.print("Enter a number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second number");
		int number2 = input.nextInt();

		int result = number1 + number2;
		int result1 = number1 - number2;

		System.out.println("the addition of two numbers are: " + result); 
		System.out.println("the subraction of two numbers are: " + result1);

		
	}

}


