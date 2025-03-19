import java.util.Scanner;

public class FloatingNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter floating numbers");
		double number = input.nextDouble();
		System.out.print("Enter floating numbers");
		double number2 = input.nextDouble();
	
		double roundedNumber = (number *1000) / 1000;
		double roundedNumber2 =(number2 *1000) / 1000;
		
		
		if (number == number2){
		System.out.print("They are diffrent ");

		}
		else {

		System.out.print("They are indiffrent ");


		}
	}


}
		
