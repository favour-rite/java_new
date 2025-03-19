import java.util.Scanner;
public class Parlindromes{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println(" Enter five numbers ");
	int number = input.nextInt();
	if(number > 00000 && number < 99999){
		int num = number % 10;
		int secondNumber = number / 10;
		int remainder = secondNumber % 10;
		int thirdnumber = secondNumber / 10;
		int fourthnumber = thirdnumber % 10;
		int fifthnumber = thirdnumber / 10;
		int sixthnumber = fifthnumber % 10;
		int sevennumber = fifthnumber / 10;

		if  (sevennumber == num){
			System.out.println (" is a palindrome " );
		}else if (sevennumber != num){
			System.out.println (" is not a palindrome " );
		}
	}else{
		System.out.print("invalid");
	}
}
	
}