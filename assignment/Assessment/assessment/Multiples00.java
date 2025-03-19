import java.util.Scanner;
	public class Multiples00{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		int sentinel = 0;

		int number1 = 1;
		while (number1 <= 3){
			System.out.print(" Enter number: ");
			int number = input.nextInt();
				number1++;
		while (sentinel != 0);
		}

			int number2 = 0;
		if (number2 % 5 == 0){
			System.out.println("it is a multiple of five: ");	
		}
		else {
			System.out.println("not a multiple of five: ");
			System.out.print("press 0 to cancel ");
			int press = input.nextInt();
		} 
	}
}