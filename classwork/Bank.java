import java.util.Scanner;
import java.util.ArrayList;

public class Bank {

    static Scanner input = new Scanner(System.in);  
    static ArrayList<Details> accounts = new ArrayList<>();  
    
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        while(true) {  
            System.out.println("""
                =========================================
                            WELCOME TO BANK ATM
                                MENU
                |       [1.]Create an Account        	|
                |       [2.]Close Account           	|
                |       [3.]Deposit Money           	|
                |       [4.]Withdraw Money          	|
                |       [5.]Check Account Balance	|
                |       [6.]Transfer                	|
                |       [7.]Change Pin             	|
                |       [8.]Exit                    	|
                ==========================================
                """);

            System.out.print("Enter your choice: ");
            int menu = input.nextInt();
            input.nextLine();  

            if(menu == 1) {
                createAccount();
            } else if(menu == 2) {
                closeAccount();
            } else if(menu == 3) {
                depositMoney();
            } else if(menu == 4) {
                withdrawMoney();
            } else if(menu == 5) {
                checkAccountBalance();
            } else if(menu == 6) {
                transfer();
            } else if(menu == 7) {
                changePin();
            } else if(menu == 8) {
                System.out.println("Exiting...");
                break;  
            } else {
                System.out.println("Invalid choice, please try again...");
            }
        }
    }

    static class Details {
        String name;
        String phoneNumber;
        String pin;
        double accountBalance; 

        Details(String name, String phoneNumber, String pin, double accountBalance) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.pin = pin;
            this.accountBalance = accountBalance;
        }
    }

    public static void createAccount() {
        System.out.println("Open Account");

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine(); 

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Create your pin: ");
        String pin = input.nextLine(); 

        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine(); 

        System.out.print("Enter initial deposit amount: ");
        double accountBalance = input.nextDouble(); 

        Details newAccount = new Details(firstName + " " + lastName, phoneNumber, pin, accountBalance);
        accounts.add(newAccount);

        System.out.println("Account created successfully!");
    }

    public static void closeAccount() {
        System.out.print("Enter phone number to close account: ");
        String phoneNumber = input.nextLine();

        boolean found = false;
        for (Details account : accounts) {
            if (account.phoneNumber.equals(phoneNumber)) {
                accounts.remove(account);
                System.out.println("Account closed successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }

    public static void depositMoney() {
        System.out.print("Enter phone number to deposit money: ");
        String phoneNumber = input.nextLine();

        boolean found = false;
        for (Details account : accounts) {
            if (account.phoneNumber.equals(phoneNumber)) {
                System.out.print("Enter amount to deposit: ");
                double amount = input.nextDouble();
                account.accountBalance += amount;
                System.out.println("Amount deposited successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }

    public static void withdrawMoney() {
        System.out.print("Enter phone number to withdraw money: ");
        String phoneNumber = input.nextLine();

        boolean found = false;
        for (Details account : accounts) {
            if (account.phoneNumber.equals(phoneNumber)) {
                System.out.print("Enter amount to withdraw: ");
                double amount = input.nextDouble();
                if (account.accountBalance >= amount) {
                    account.accountBalance -= amount;
                    System.out.println("Amount withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }

    public static void checkAccountBalance() {
        System.out.print("Enter phone number to check balance: ");
        String phoneNumber = input.nextLine();

        boolean found = false;
        for (Details account : accounts) {
            if (account.phoneNumber.equals(phoneNumber)) {
                System.out.println("Account balance: " + account.accountBalance);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }

    public static void transfer() {
        System.out.print("Enter your phone number for transfer: ");
        String phoneNumber = input.nextLine();

        boolean found = false;
        Details senderAccount = null;
        for (Details account : accounts) {
            if (account.phoneNumber.equals(phoneNumber)) {
                senderAccount = account;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.print("Enter recipient phone number: ");
            String recipientPhone = input.nextLine();

            Details recipientAccount = null;
            for (Details account : accounts) {
                if (account.phoneNumber.equals(recipientPhone)) {
                    recipientAccount = account;
                    break;
                }
            }

            if (recipientAccount != null) {
                System.out.print("Enter amount to transfer: ");
                double amount = input.nextDouble();

                if (senderAccount.accountBalance >= amount) {
                    senderAccount.accountBalance -= amount;
                    recipientAccount.accountBalance += amount;
                    System.out.println("Transfer successful.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Recipient account not found.");
            }
        } else {
            System.out.println(" Sender account not found.");
        }
    }

    public static void changePin() {
        System.out.print("Enter phone number to change PIN: ");
        String phoneNumber = input.nextLine();

        boolean found = false;
        for (Details account : accounts) {
            if (account.phoneNumber.equals(phoneNumber)) {
                System.out.print("Enter new PIN: ");
                String newPin = input.nextLine();
                account.pin = newPin;
                System.out.println("PIN changed successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }
}