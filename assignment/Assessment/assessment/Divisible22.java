import java.util.Scanner;
	public class Divisible22{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		

		System.out.println("Enter number: ");
		int number = input.nextInt();

		if (number % 5 == 0 && number % 11 == 0){

			System.out.print("divisible by 5 ");
		}
		else {
			System.out.print("divisible by 11 ");	
		}
	
		
}
}