import java.util.Scanner;
public class Numbers1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a number ");
		int first = input.nextInt();
		System.out.print("Enter the second ");
		int second = input.nextInt();

		int number = 0;
		int digit = 1;

		while(first >=  1){
			digit= digit * second;
				first--;
		
		}
	
		System.out.println(digit);		
	}

}