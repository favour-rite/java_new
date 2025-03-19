import java.util.Scanner;
public class Arithmeticoperation{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int first = input.nextInt();

		System.out.println("Enter a number: ");
		float second = input.nextFloat();

		System.out.println("Enter a number: ");
		double third = input.nextDouble();

		double numbers = (first+second + third);
		System.out.println(numbers);


	}

}