package bankservices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {

   private Account account;
   private ArrayList<Account> accountList = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        account = new Account("First Name", "Last Name", 1234,"0708434521", 1);
        accountList.add(account);
    }

    @Test
    public void testAddAccountNumberIncrease() {
        assertEquals(1, accountList.size());
    }

    @Test
    public void testAddAccountNumberIncreasesMoreThanOne() {
        Account account2 = new Account("First Name", "Last Name", 1234,"0708434521", 1);
        Account account3 = new Account("First Name", "Last Name", 1234,"0708434521", 1);
        Account account4 = new Account("First Name", "Last Name", 1234,"0708434521", 1);
        Account account5 = new Account("First Name", "Last Name", 1234,"0708434521", 1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);
        accountList.add(account5);
        assertEquals(5, accountList.size());
    }

    @Test
    public void testUsersName() {
        assertEquals("First Name", account.getFirstName());
        assertEquals("Last Name", account.getLastName());
    }
    @Test
    public void testThatPasswordExist(){
        assertEquals(1234, account.getPassword());
    }
    @Test
    public void testThatPhoneNumberExist() {
        assertEquals("0708434521", account.getphoneNumber());
    }
    @Test
    public void testInitialBalance(){

        assertEquals(0.0, account.getBalance(),"Initial balance should be zero");
    }
    @Test
    public void testDesposit(){
        account.deposit(2000);
        assertEquals(2000.00, account.getBalance(),"Deposit should be 200.00");
    }
    @Test
    public void testWithdraw(){
        account.deposit(2000.00);
        account.withdraw(2000.00);
        assertEquals(00.00, account.getBalance(),"Withdraw should be 200.00");
    }
    @Test
    public void testDepositNegativeAmount(){
        account.deposit(-2000.00);
        assertEquals(00.00, account.getBalance(),"Deposit should not be negative amount");
    }
    @Test
    public void testWithdrawNegativeAmount(){
        account.deposit(8000.00);
        account.withdraw(-2000.00);
        assertEquals(8000.00, account.getBalance(),"Withdraw should not be negative amount");
    }
    @Test
    public void testDepositIsEmpty(){
        account.deposit(0);
        assertEquals(0.0, account.getBalance(), "Balance should remain the same when deposit is empty.");
    }
    @Test
    public void test_ThatWithdrawal_Amount_IsEmpty(){
        account.deposit(2000.00);
        account.withdraw(0);
        assertEquals(2000.00,account.getBalance(),"Withdrawal should not be empty when money not zero.");
    }
    @Test
    public void test_ThatWithdrawal_Amount_IsBeyondAmount(){
        account.deposit(2000.00);
        account.withdraw(200000.00);
        assertEquals(2000.00,account.getBalance(),"Withdrawal should not be beyond amount.");
    }



}