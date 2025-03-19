import java.util.Scanner;
public class Triangle{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a number ");
		int number = input.nextInt();

		for(int count = 1; count <= number; count++){
			System.out.println("");

			for (int counter = 1; counter <= count; counter++){
				System.out.print("*");
			}
		}
	}
}