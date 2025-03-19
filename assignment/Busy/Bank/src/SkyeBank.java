import bankservices.Account;
import bankservices.Bank;
import java.util.Scanner;

public class SkyeBank {

    private static Bank skyeBank = new Bank();
    private static Account accounts;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("""

                Welcome to Skye Bank......
                *** Customer Satisfaction, Our Priority ***

                1. -> Create Account.
                2. -> Deposit .
                3. -> Withdraw.
                4. -> Transfer.
                5. -> Check Balance.
                6. -> Help.
                7. ->  Call Customer Care...
                8. -> Exit..
                """);
                
        usersChoice();
    }

    private static void usersChoice() {
        int choice = Integer.parseInt(input("Input Your Choice: "));
        switch(choice) {
            case 1: createAccount(); break;
            case 2: deposit(); break;
            case 3: withdraw(); break;
            case 4: transfer(); break;
            case 5: checkBalance(); break;
            case 6: help(); break;
            case 7: callCustomerCare(); break;
            case 8: exit(); break;
            default:
                System.out.println("Invalid Option, Try again...");
                mainMenu();
                break;
        }
    }



    private static void createAccount() {
        String firstName = input("Input First Name: ");
        String lastName = input("Input Last Name: ");
        String phoneNumber = input("Input Phone Number: ");
        int password = Integer.parseInt(input("Input Password: "));


        skyeBank.createAccount(firstName, lastName, password, phoneNumber);
        System.out.println("Account created successfully!!!");
        System.out.printf("Your account number is %d%n", accounts.getAccountNumber());

        mainMenu();
    }

    private static void deposit() {
        int accountNumber = Integer.parseInt(input("Input Account Number: "));
        double amount = Double.parseDouble(input("Input amount to deposit: "));
        int password = Integer.parseInt(input("Input Password: "));

        skyeBank.deposit(amount, accountNumber, password);
        System.out.println("Deposit successful!!");
        System.out.println("You have deposited " + amount + " " );
        mainMenu();
    }

    private static void withdraw() {
        int accountNumber = Integer.parseInt(input("Input Account Number: "));
        double withdrawAmount = Double.parseDouble(input("Input amount to withdraw: "));
        int password = Integer.parseInt(input("Input Password: "));

        skyeBank.withdraw(withdrawAmount, password, accountNumber);
        System.out.println("Amount has been withdrawn successfully.");
        System.out.println("You have withdrawn " + withdrawAmount + " \n Your account balance is" + accounts.getBalance());
        mainMenu();
    }

    private static void transfer() {
        String senderAccount = input("Input sender's account number: ");
        String receiverAccount = input("Input receiver's account number: ");
        double amount = Double.parseDouble(input("Input amount to transfer: "));
        int password = Integer.parseInt(input("Input your password: "));

        //skyeBank.transfer(senderAccount, receiverAccount, amount, password);
        System.out.println("Transaction successful.");
        System.out.println("Your Transaction of " + amount + " has been transferred successfully." );
        System.out.println("Your balance is "+ accounts.getBalance());
        mainMenu();
    }

    public static void checkBalance() {
        int accountNumber = Integer.parseInt(input("Input account number: "));
        int password = Integer.parseInt(input("Input your password: "));

        skyeBank.checkBalance(accountNumber, password);
        System.out.println("Your balance is: " + accounts.getBalance());
        mainMenu();
    }

    private static void help() {
        System.out.println("""
                Company
                About us
                Press & Media
                Contact us
                Report an Issue
                Security
                Resources
                Privacy Policy
                Terms & Conditions
                Documentation
                Personal
                Business
                """);
        System.out.print("For MORE DETIALS VISIT THE HEADQUATER OF SKYE BANK PLC");
        mainMenu();
    }
    private static void callCustomerCare() {
        System.out.println("Dailing... Network Failed, Please try again...");
        mainMenu();
    }

    private static void exit() {
        System.out.println("Thanks for Your Patronage!!!");
        System.out.println("We are here for you to provide quick customer service. Visit our in-app customer service center or physical customer service center or send us a message via official social media or call us via hotline: ** Dial 777 **");
        System.exit(0);
    }

    private static String input(String prompt) {
        System.out.print(prompt);
        return new Scanner(System.in).nextLine();
    }

    private static void print(String prompt) {
        System.out.println(prompt);
    }
}