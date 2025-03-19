import java.util.Random;
import java.util.Scanner;
public class GuessNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		Random rand = new Random();
		int number = 0;
		int random = rand.nextInt(20) + 1;

		do{
		System.out.println("Guess a number between 1 to 20: ");
		number = input.nextInt();

		if (number > random ){
		
		System.out.print("Too high, try again: ");
		} 

		else if(number < random) {
		System.out.print("Too low, try again: ");
		}

		else if(number == random){
		System.out.print(" You won: ");
		}
	
		} while (number != random);
}
}