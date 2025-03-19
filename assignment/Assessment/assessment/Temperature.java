import java.util.Scanner;
public class Temperature{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter temperature: ");
		int temperature = input.nextInt();
		
		if (temperature < 10){
			System.out.println("cold ");
		}

		else if (temperature <= 25){
			System.out.println(" warm ");
		}

		else if (temperature > 25){
			System.out.println(" hot ");
		}

		



}
}