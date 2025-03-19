import java.util.Scanner;
public class DoWhileLoopTask{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number3 = 0;
			while(number3 != 0)
			System.out.print("Enter number: ");
				int number = input.nextInt();

			System.out.print("Enter number: ");
				int number2 = input.nextInt();
			
				int sum = number + number2;
			System.out.println(sum);

			System.out.println("Do u wish to play again: ");
				number3 = input.nextInt();
						
	}
}