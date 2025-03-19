package bankservices;

import java.util.Random;
import java.util.ArrayList;

public class Bank {

    private final ArrayList<Account> accounts  = new ArrayList<>();
    private Random random = new Random();


    public void createAccount(String firstName, String lastName, int correctPassword, String phoneNumber) {
        int accountNumber = generateAccountNumber();
        Account account = new Account(firstName, lastName, correctPassword, phoneNumber, accountNumber);
        this.accounts.add(account);
        System.out.println("Account Has Been Created");
        System.out.println("Account number: " + accountNumber);

    }
    public Account getAccount(Account account) {
        for (Account accountSearch : this.accounts) {
            if (accountSearch.equals(account)) {
                return accountSearch;
            }
        }
        return null;
    }
    public int generateAccountNumber() {
        int generatedAccountNumber = random.nextInt(100000);
        return generatedAccountNumber;
    }
    public int getAccountNumber(Account account) {
        return account.getAccountNumber();
    }

    public int getSize() {
        return this.accounts.size();
    }
    public int getAccountNumber(int accountNumberCheck) {
        return accountNumberCheck;
    }


    public void deposit(double amount, int accountNumber, int password) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                if (account.getPassword() != password) {
                    System.out.println("Invalid password");
                }
                account.deposit(amount);
            } else {
                System.out.println("Account number " + account.getAccountNumber() + " doesn't match ");
            }
        }
    }

    public void checkBalance(int password, int accountNumber) {

        for (Account account : accounts) {

            if (account.getAccountNumber() == accountNumber) {
                if ((password == 4) && (account.getPassword() == password)) {
                    //return account.getBalance();
                } else System.out.println("Incorrect password.. It doesn't match four digits");
            }
        }
        System.out.println("Your account balance is: " + accounts.getFirst().getBalance());

    }

    
    public void withdraw(double amount, int accountNumber, int password) {



        for (int index = 0; index < accounts.size(); index++) {

            if (accounts.get(index).getAccountNumber() == accountNumber) {
                //if (password == 4 && accounts.getPassword() == password) {
                    accounts.get(index).withdraw(amount);
                }else System.out.println("Incorrect password.. It doesn't match four digits");
            }
        }
    }
  



}

















