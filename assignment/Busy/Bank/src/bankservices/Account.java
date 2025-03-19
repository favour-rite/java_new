package bankservices;

public class Account {

    public String phoneNumber;
    private String firstName;
    private String lastName;
    private int password;
    private double balance;
    private int accountNumber;

    public Account(String firstName,String lastName, int correctPassword, String phoneNumber,int accountNumber) {
            this.accountNumber = accountNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = correctPassword;
            this.phoneNumber = phoneNumber;
    }
    public String getFirstName(){

        return firstName;
    }
    public String getLastName(){

        return lastName;
    }
    public int getPassword(){

        return password;
    }
    public int setPassword(){
        return password;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public double getBalance() {

        return balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double amount) {
        validateAmount(amount);
    }
    private void validateAmount(double amount){
        if(amount > 0){
            balance += amount;
        }else {
            System.out.println("Invalid amount: Be positive for once ");
        }
    }


    public void withdraw(double amount) {
        validateWithdrawal(amount,password);
    }
    private void validateWithdrawal(double amount, int password){
        
        if(this.password == this.password) {
            if (amount > 0 && balance >= amount) {
                this.balance -= amount;
            } else {
                System.out.println("Insufficient Balance: Why is your life so negative ???");
            }
            if (this.password != password) {
                System.out.println("Incorrecct pin");

            }
        }

    }
    public void updatePin(int oldPassword, int newPassword) {
        if(this.password == oldPassword) {
            this.password = newPassword;
        }
        else System.out.println("Old pin is incorrect");
    }

    @Override
    public String toString() {
        return String.format("Account Name: %s%nAccount Balance: %s%nAccount Number: %s", firstName +" "+ lastName, this.balance, this.accountNumber);
    }


}


