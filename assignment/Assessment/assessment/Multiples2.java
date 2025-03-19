import java.util.Scanner;
	public class Multiples2{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		int sentinel = 0;
		int counter = 0;

		do {
		
			System.out.print(" Enter number: ");
			int number = input.nextInt();
		
		if (number % 5 == 0){
			System.out.print("it is a multiple of five: ");	
		}
		else {
			System.out.print("not a multiple of five: ");
		
			System.out.print("press 0 to cancel ");
			int press = input.nextInt();
		}
		} while (sentinel != 0);
	}
}