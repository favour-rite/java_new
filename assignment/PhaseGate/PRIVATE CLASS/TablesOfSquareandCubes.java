import java.util.Scanner;

public class TablesOfSquareandCubes{
public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

		System.out.println("===========================");
		System.out.println(" number\tsquare\tcube ");
		System.out.println("===========================");

		for(int number = 0; number <= 10; number++){

			int square = number * number;
			int cube = number * number * number;

			System.out.println(number + "\t" + square + "\t" + cube);

		}

	}
}