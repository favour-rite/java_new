import java.util.Scanner;
public class MachineApp{
	public static void main(String[] args){	


	Scanner userInput = new Scanner(System.in);		

	String names = null;
	String pin = " 0000";
	String inputPin;
	
	int accountBalance = 10000;
	boolean sentinel = true;
	double transferAmount = 0;

	
while(sentinel){
		System.out.println("""
			
			MENU
	
		[1.]Create an Account
			
		[2.] Withdrawal
		[3.] Deposite
		[4.] Transaction
		[5.] Check Account Number
		[6.] Close account
		[7.] Change Pin
		[8.] Exit 
	""");
		int menu = userInput.nextInt();

	switch(menu){

		case 1: System.out.println(" Enter first name and last name: ");
			names = userInput.next();

			System.out.println(" Enter pin: ");
			pin = userInput.next();

			System.out.println("Enter bvn: ");
			String bvn = userInput.next();
		
			System.out.println("Enter number: ");
			double number = userInput.nextDouble();
		
			break;
			

		case 2: System.out.println("Enter amount to withdraw: ");
			int withdrawal = userInput.nextInt();

			System.out.println(" Enter pin: ");
			String maybepin = userInput.next();
			
			if(!maybepin.equals(pin) || pin.length() != 4){
				System.out.println("Invalid input Try Again");
			
			}else if(withdrawal < accountBalance && withdrawal < 0){
				accountBalance -= withdrawal;
				System.out.println("Insufficient Funds!!");
				System.out.println(names+ "Your Balance is: &"+ accountBalance);
			}
			break;

		case 3: System.out.println("deposite money ");
			double deposite = userInput.nextDouble();
			if(deposite < 0){
				deposite+=accountBalance;
			}else {
				System.out.print("Invalid amount");
			}
			System.out.println(names + " Your Balance is: $" + deposite);
			break;
		case 4: System.out.println("Change pin");




		case 5: System.out.println("enter ur pin");
                   	 inputPin = userInput.next();

                   	if (inputPin == pin) {
			System.out.print("Enter amount you want to transfer: ");
                        transferAmount = userInput.nextDouble();
			}

                        if (transferAmount > 0 && transferAmount <= accountBalance) {
                           accountBalance -= transferAmount;

                        	System.out.println("Transferred: $" + transferAmount);
                        } else {
                            System.out.println("Transfer failed: Insufficient funds or invalid amount.");       }
                     
                    break;

		case 6: System.out.println("Current balance: $" + accountBalance);
                    break;

			
		case 8:
			sentinel = false;
			break;				
		}
	}




}




}





