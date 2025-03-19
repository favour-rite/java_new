import java.util.Scanner;
public class EqualNumber{
	public static void main (String [] args){

	Scanner input = new Scanner(System.in);
	
	System.out .print("Enter number ");
	int number1 = input.nextInt();
	System.out .print("Enter number ");
	int number2 = input.nextInt();
	System.out .print("Enter number ");
	int number3 = input.nextInt();
	
	int number = 0;

	if(number1 == number2 && number1 == number3 && number1 == number1 ){
		System.out.println(" number is equal: ");
	}           
       	else(number3 == number2 && number3 == number2 && number3 == number1){
		System.out.println("number are not equal: ");

        }	
	
	

}
}



