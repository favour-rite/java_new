import java.util.Scanner;
	public class DecreasingOrder{
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		int count = 0;
		while(count < 10){

		System.out.print("Enter number. ");
		int number1  = input.nextInt();

		System.out.print("Enter number. ");
		int number2 = input.nextInt();

		System.out.print("Enter number. ");
		int number3 = input.nextInt();
		
	
		if (number1 < number2 && number2 < number3){
			System.out.print("increasing order ");
		}
		else {
			System.out.print("decreasing order ");
		}
			count++;
		}
}
}