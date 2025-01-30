package bankservices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;


public class BankTest {
    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Test
    public void testThat_bankAccountsIsEmpty() {
        assertTrue(bank.isAccountsEmpty());
    }

    @Test
    public void testThat_bankAccountsReturnCorrectSizeAfterCreatingAccountXY() {
        int account1 = bank.createAccount( "Mercy", "Janet", "1234");
        int account2 = bank.createAccount( "Yomi", "Olaide", "3245");
        assertEquals(2, bank.size());
    }

    @Test
    public void testThat_bankAccountSizeReturnCorrectSizeAfterRemovingXY() {
        int account1 = bank.createAccount(  "Mercy", "Janet", "1234");
        int account2 = bank.createAccount(  "Yomi", "Olaide", "3245");
        assertEquals(2, bank.size());
        bank.remove(account1);
        assertEquals(1, bank.size());
    }

    @Test
    public void testThat_bankAccountNumberReturnCorrectValueAfterCreatingAccountX() {
        int account1 = bank.createAccount( "Mercy", "Janet", "1234");
        assertEquals(1, bank.findAccountByAccountNumber(account1).getAccountNumber());
    }

    @Test
    public void testThat_bankBalanceReturnCorrectValueAfterCreatingAccountY() {
        int account1 = bank.createAccount( "Mercy", "Janet", "1234");
        assertEquals(1, bank.findAccountByAccountNumber(account1).getAccountNumber());
        assertEquals(0, bank.findAccountByAccountNumber(account1).getBalance("1234"));
    }

    @Test
    public void testThat_bankFindsAccountByAccountNumber_andReturnsAccountNumber() {
        int account1 = bank.createAccount( "Mercy", "Janet", "1234");
        int account2 = bank.createAccount( "Yomi", "Olaide", "3245");
        int account2AccountNumber = bank.findAccountByAccountNumber(account2).getAccountNumber();
        assertEquals(2, account2AccountNumber);
    }

    @Test
    public void testThat_bankFindsAccountByAccountNumber_throwsException_whenBankAccountNotFound() {
        int account1 = bank.createAccount( "Mercy", "Janet", "1234");
        assertThrows( IllegalArgumentException.class, () -> bank.findAccountByAccountNumber(2));
    }

    @Test
    public void testThat_bankDepositsIntoAccount() {
        int account1 = bank.createAccount( "Mercy", "Janet", "1234");
        int account1AccountNumber = bank.findAccountByAccountNumber(account1).getAccountNumber();
        assertEquals(0, bank.checkBalance(account1AccountNumber, "1234"));
        bank.deposit(account1AccountNumber, 5_000);
        assertEquals(5_000, bank.checkBalance(account1AccountNumber, "1234") );
    }

    @Test
    public void testThat_bankDepositsIntoAccount_throwsExceptionWhenPinDoesNotMatch() {
        int account1 = bank.createAccount( "Mercy", "Janet", "1234");
        int account1AccountNumber = bank.findAccountByAccountNumber(account1).getAccountNumber();
        assertThrows(InputMismatchException.class, () -> bank.checkBalance(account1AccountNumber, "4321"));
    }

    @Test
    public void testThat_bankDeposit_throwsException_whenAccountDoesNotExist() {
        assertThrows( IllegalArgumentException.class, () -> bank.findAccountByAccountNumber(1));
    }

    @Test
    public void testThat_bankWithdrawsFromAccountX() {
        int account1 = bank.createAccount( "Mercy", "Janet", "1234");
        int account1AccountNumber = bank.findAccountByAccountNumber(account1).getAccountNumber();
        assertEquals(0, bank.checkBalance(account1AccountNumber, "1234"));
        bank.deposit(account1AccountNumber, 5_000);
        assertEquals(5_000, bank.checkBalance(account1AccountNumber, "1234") );
        bank.withdraw(1,2_000, "1234");
        assertEquals(3_000, bank.checkBalance(account1AccountNumber, "1234") );
    }

    @Test
    public void testThat_bankDoesNotWithdrawsFromAccount_whenAmountIsLessThanZero() {
        int account1 = bank.createAccount( "Mercy", "Janet", "1234");
        int account1AccountNumber = bank.findAccountByAccountNumber(account1).getAccountNumber();
        assertEquals(0, bank.checkBalance(account1AccountNumber, "1234"));
        assertThrows(IllegalStateException.class, () ->bank.withdraw(1,2_000, "1234"));
    }

    @Test
    public void testThat_bankDoesNotWithdrawsFromAccount_whenAmountIsGreaterThanBalance() {
        int account1 = bank.createAccount( "Mercy", "Janet", "1234");
        int account1AccountNumber = bank.findAccountByAccountNumber(account1).getAccountNumber();
        bank.deposit(account1AccountNumber, 1_000);
        assertEquals(1_000, bank.checkBalance(account1AccountNumber, "1234"));
        assertThrows(IllegalStateException.class, () ->bank.withdraw(1,2_000, "1234"));
    }

    @Test
    public void testThat_bankTransfersFromAccountXToAccountY() {
        int account1 = bank.createAccount( "Mercy", "Janet", "1234");
        int account1AccountNumber = bank.findAccountByAccountNumber(account1).getAccountNumber();
        assertEquals(0, bank.checkBalance(account1AccountNumber, "1234"));
        int account2 = bank.createAccount( "Yomi", "Olaide", "3245");
        int account2AccountNumber = bank.findAccountByAccountNumber(account2).getAccountNumber();
        assertEquals(0, bank.checkBalance(account2AccountNumber, "3245"));
        bank.deposit(account2AccountNumber, 5_000);
        bank.deposit(account1AccountNumber, 5_000);
        assertEquals(5_000, bank.checkBalance(account1AccountNumber, "1234") );
        assertEquals(5_000, bank.checkBalance(account2AccountNumber, "3245") );
        bank.transfer(1, 2, 2_000, "1234");
        assertEquals(3_000, bank.checkBalance(account1AccountNumber, "1234") );
        assertEquals(7_000, bank.checkBalance(account2AccountNumber, "3245") );
    }

}
