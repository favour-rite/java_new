import java.util.Scanner;
	public class DecreasingOrder{
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int sentinel = 0;
		

		int count = 0;
		do{
			System.out.print("Enter number. ");
			int number1  = input.nextInt();

			System.out.print("Enter number. ");
			int number2 = input.nextInt();

			System.out.print("Enter number. ");
			int number3 = input.nextInt();
		
	
		if (number3 > number2 && number2 > number1){
			System.out.print("increasing order ");
		}
		else{
			System.out.print("decreasing order ");
		}
			System.out.println("press 0 to quit ");
			int press = input.nextInt();

		} while ( sentinel != 0 );



	}
}