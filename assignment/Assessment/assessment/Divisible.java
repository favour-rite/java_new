import java.util.Scanner;
	public class Divisible{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);

		int sentinel = 0;

		do{
		
			System.out.print("enter number ");
			int number = input.nextInt();
		

		if (number % 5 == 0 || number % 11 == 0){

			System.out.print("it is divisible by 5 ");
		}
		else {
			System.out.print("divisible by 11 ");	

			System.out.println("press 0 to quit ");
			int press = input.nextInt();
		}
		} while ( sentinel != 0 );
		
}
}