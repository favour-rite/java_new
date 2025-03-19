import java.util.Scanner;
public class CreditLimitCalculator{
	public static void main (String[] args){

	Scanner input = new Scanner(System.in);

 	System.out.print("Enter the number of customers: ");
        int numberOfCustomers = scanner.nextInt();
        

	for(int count = 0; count < numberOfCustomers; count++){

		System.out.println("\nProcessing customer #" + (i + 1));

		System.out.println("input account number:");
		int accountNumber = input.nextInt();
	
		System.out.println("input beginning balance:");
		int beginningBalance = input.nextInt();
	
		System.out.println("input total charges for the month:");
		int charges = input.nextInt();
	
		System.out.println("input total credits of the months :");
		int credits = input.nextInt();

		System.out.println("input allowed credit limit:");
		int creditLimit = input.nextInt();

		int newBalance = beginningBalance + charges - credits;

		System.out.println("New Balnace for account is ", acccountNumber, "is:", newBalance);

		if (newBalnace > creditLimit){
			System.out.print("credit limit exceeded")
		}else {

			System.out.println("Credit limit is within the allowed limit.");
	}