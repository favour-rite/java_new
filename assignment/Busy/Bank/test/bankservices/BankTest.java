package bankservices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Bank skyeBank;
    private Account account;

    @BeforeEach
    public void setUp() {
        skyeBank = new Bank();
        account = new Account("firstName","lastName",1234,"0908765433",23);
    }

    @Test
    public void testCreateAccount() {
        skyeBank.createAccount("firstName", "lastName",1234,"09012345678");
        assertEquals("firstName", account.getFirstName());
        assertEquals(1234, account.getPassword());
        assertEquals(63456, account.getAccountNumber());
    }

    @Test
    public void testBank_CreateAccount() {
        skyeBank.createAccount("firstName", "lastName", 1234, "09012345234");
        assertEquals(1, skyeBank.getSize(),"test for creattion of account");
    }
    @Test
    public void testBankCanCreateNumerousAccounts() {
        skyeBank.createAccount("firstName", "lastName", 1234, "09012345234");
        skyeBank.createAccount("firstName", "lastName", 1234, "09012345234");

        assertEquals(23456, account.getAccountNumber());
        assertEquals(65748, account.getAccountNumber());
        assertEquals(2, skyeBank.getSize(),"checking if bank can create many account");
    }

    @Test
    public void test_ThatMoneyIsDeposited() {
        skyeBank.createAccount("firstName", "lastName", 1234, "09012345234");
        skyeBank.getAccountNumber(3874);
        account.deposit(200.00);
        assertEquals(200.00, skyeBank.getSize(),"confirming if money is deposited into the owner account");
    }
}
//    public void testTransfer_ThatSendMoneyToReciever() {
//        Account recieverAccount = new Account();
//        accounts.deposit(300.00);
//
//        recieverAccount.transfer(recieverAccount, 100.00);
//        assertEquals(200.00, accounts.getBalance(), "Balance should be 200.00 after transferring 100 from 300");
//        assertEquals(100.00, recieverAccount.getBalance(), "Another account balance should be 100 after receiving transfer");
//    }

