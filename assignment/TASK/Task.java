import java.util.Scanner;
public class Task {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter number ");
		int number = input.nextInt();
		System.out.print("enter number ");
		int number2 = input.nextInt();

		System.out.println(number > number2? "great!": "not greater!");
			
		int sum = number + number2;

		
		System.out.println(sum > 50?"even sum is greater" : "not greater");
		

}

}














	
