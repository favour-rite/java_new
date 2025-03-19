import java.util.Scanner;
	public class OddandEven{
		public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		
		int sentinel = 0;
		
		do{
		
			System.out.println("Enter number: ");
			int number = input.nextInt();
			System.out.println("Enter number: ");
			int number2 = input.nextInt();

			System.out.println("Enter number: ");
			int number3 = input.nextInt();



		if (number % 2 == 0){ 
			System.out.print("it is even: ");
		}
		else { 
			System.out.print("it is odd: ");
			System.out.print("press 0 to quit");
			int press = input.nextInt();
		}
		} while (sentinel != 0 );
			

	}
}
