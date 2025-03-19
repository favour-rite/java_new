import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a Year: ");
		int leapYear = input.nextInt();

		if (leapYear % 4 == 0){
			
		System.out.println("it is a leap year: ");
		}
		else {
		System.out.println("it is a not a leap year: ");


		}
	
	}
}
