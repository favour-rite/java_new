import java.util.Scanner;
	public class Divisible00{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		for (int number = 1; number <= 3; number++){

			System.out.println("Enter number: ");
			int number1 = input.nextInt();
		
		
		if (number1 % 5 == 0){

			System.out.println(number1 + " divisible by 5 ");
		}
		else {
			System.out.println(number1 + " not divisible by 5 ");	
		}

		if (number1 % 11 == 0){
			System.out.println(number1 + " divisible by 11 ");
		}
		else {
			System.out.println(number1 + " not divisible by 11 ");	
		}
		}

		
}
}