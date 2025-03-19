import java.util.Scanner;
public class Arithmetic{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number ");
		int number = input.nextInt();
		
		System.out.print("Enter number ");
		int number2 = input.nextInt();

		int result = number * number;
		int result2 = number2 * number2;

		int answer = result - result2;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(answer);
















	}


}