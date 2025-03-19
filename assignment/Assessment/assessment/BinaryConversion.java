import java.util.Scanner;
public class BinaryConversion{
	public static void main(String [] args){ 
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number ");
		int number = input.nextInt();

		String answer = "";

		String result = "";
		

		while (number != 0){
			int remainder = number % 2;
				result += remainder;
                                number /= 2;
			}
			

		for(int digit = result.length()-1; digit >= 0; digit--){
		

		 answer += result.charAt(digit);
		
		}

		System.out.print(answer);

}
}



	