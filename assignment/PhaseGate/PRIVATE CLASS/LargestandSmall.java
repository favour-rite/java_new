
import java.util.Scanner;
public class LargestandSmall{
	public static void main(String [] args){

	Scanner userInput = new Scanner(System.in);

	int largest = 0;
	int smallest = Integer.MAX_VALUE;

	for(int count = 1; count <= 5; count++){

		System.out.println(" enter integer ");
		int number = userInput.nextInt();
	
		if (number > largest){
			largest = number;
		}
		 if (number < smallest ){
			smallest = number;
		}
	}

	System.out.println("Largest integer: " + largest );
	System.out.println("Smallest integer: " + smallest);


	}



}