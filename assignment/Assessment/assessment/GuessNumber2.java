import java.util.Scanner;
public class GuessNumber2{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
		
		int number1 = 4;

		System.out.print ("Enter a number ");
		int number = input.nextInt();
	
	if (number > number1 ){
		
		System.out.println(" high, try again: ");
		} 
	else if(number < number1){
		System.out.println(" low, try again: ");
		}


}


}