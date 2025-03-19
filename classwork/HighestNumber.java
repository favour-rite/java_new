import java.util.Scanner;
public class HighestNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number1 = input.nextInt();

		System.out.print("Enter a number: ");
		int number2 = input.nextInt();

		System.out.print("Enter a number: ");
		int number3 = input.nextInt();



		if (number1 > number2 && number2 > number3){

			System.out.print(" highest ");
}

		 if (number2 > number1 && number1 > number3){

			System.out.print(" highest ");
}

		if (number3 > number1  && number3 > number2){

			System.out.print(" highest ");

}

		
			
	}


}

    	

