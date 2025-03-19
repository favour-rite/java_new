import java.util.Scanner;
public class Addition{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		int num = 0;

		do {
			System.out.print("enter number: ");
				int number1 = input.nextInt();

			System.out.print("enter number: ");
				int number2 = input.nextInt();

				int total = number1 + number2; 

			System.out.println("the total is   "+ total);

			System.out.println("Enter 0 to stop");
				num = input.nextInt();
		}

		while (num == 1 );

		

}

}