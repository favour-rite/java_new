import java.util.Scanner;

public class ComparingNumbers{
public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

		System.out.println("enter first number ");
		int number1 = userInput.nextInt();
		
		System.out.println("enter first number ");
		int  number2 = userInput.nextInt();

		System.out.println("enter first number ");
		int number3 = userInput.nextInt();

		int sum = number1 + number2 + number3;
		int average = number1 + number2 + number3 / 3;
		int product = number1 * number2 * number3;
		
	
		int smallest = number1;

		if (number2 > smallest){
			smallest = number2;
		}
		if (number3 > smallest){
			smallest = number3;
		}
		

		int largest = number1;

		if ( number2 > largest){
			largest = number2;
		}
		else if (number3 > largest){
			largest = number3;
		}
		
		System.out.println("the sum is " + sum);
		System.out.println("the average is " + average);
		System.out.println("the product is " + product);
		System.out.println("the smallest is " + smallest);
		System.out.println("the largest is " + largest);
		
		userInput.close();
	
	}
}