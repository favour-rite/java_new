import java.util.Scanner;
public class CreditCarVaidator{

	public static void main(String[] args){

	Scanner userInput = new Scanner(System.in);

	String cardNumbers;
	while(true){

	System.out.println("Hello, Kindly EnterCard details to verify ");
	cardNumbers = userInput.next();

	if(cardNumbers.length() >= 13 && cardNumbers.length() <= 16){
			break;
	}else{
		System.out.println("Invalid card numbers");
		System.out.println("The length must be between 13 and 16");
				
		}
	

	}

	System.out.println("****************************************************************************************************************");
	if (cardNumbers.charAt.equals("4")){
		System.out.println("**Credit Card Type: VisaCard");
	}
	else if(cardNumbers[0].equals("5")){
		System.out.println("**Credit Card Type: MasterCard");
	}

	else if(cardNumbers[0].equals("3") && cardNumbers[1].equals("7")){
		System.out.println(" **Credit Card Type: American Express Card ");

	}else if(cardNumbers[0].equals("6")){
		System.out.println(" **Credit Card Type: Discover Card ");
	}
	else{
		System.out.println(" **Credit Card Type: Invalid ");
	}

	System.out.println("****************************************************************************************");

	System.out.println("Credit Card Number: " + cardNumbers);
	System.out.println("Credit Card Type: " + cardNumbers.length());
	
	for(int index = cardNumbers.length(); index >= 0; index-=2){
		int evenNumber = Integer.valueOf(cardNumbers.charAt(index - 2));
		System.out.println(evenNumber);

	}








	//System.out.println("Credit Card Digit: " cardNumbers.length());
	//System.out.println("Credit Card Validity Status: " cardNumbers.length());



	

	}
}