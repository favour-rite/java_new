import java.util.Scanner;

public class ComparingInteger{
	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("enter first number ");
		int input = userInput.nextInt();

		int squareOfInput = input * input;
		System.out.println( squareOfInput );

		if (input > 100 ){
			System.out.println(" number is greater than 100 ");
		}else if(input == 100){

			System.out.println(" number is equals 100 ");			}else if (input < 100){

			System.out.println(" number is less than 100 ");
		}


		if (squareOfInput > 100 ){
			System.out.println(" number is greater than 100 ");
		}else if(squareOfInput == 100 ){
			System.out.println(" number is equal 100 ");

		}else if(squareOfInput < 100 ){

			System.out.println(" number is less than 100 ");
		}

	}
}