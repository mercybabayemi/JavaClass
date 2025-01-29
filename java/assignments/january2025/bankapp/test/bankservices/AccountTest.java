package bankservices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(  "mercy", "Jane", "1234");
    }

    @Test
    public void testAccount_exists(){
        assertEquals(0 , account.getAccountNumber());
        assertEquals("mercy", account.getFirstName());
        assertEquals("Jane", account.getLastName());
    }

    @Test
    public void testThat_accountFirstNameUpdates() {
        account.updateFirstName("mercy", "Mary");
        assertEquals("Mary", account.getFirstName());
    }

    @Test
    public void testThat_accountDeposits_successfully() {
        account.deposit(5000);
        assertEquals(5000, account.getBalance("1234"));
    }

    @Test
    public void testThat_accountWithdraws_successfullyWhenAmountIsGreaterThanZeroAndLessThanBalance() {
        account.deposit(5000);
        account.deposit(5000);
        assertEquals(10000, account.getBalance("1234"));
        account.withdraw(4000,"1234");
        assertEquals(6000, account.getBalance("1234"));
    }

    @Test
    public void testThat_accountThrowsException_whenAccountIsEmpty() {
        assertThrows(IllegalStateException.class, () -> account.withdraw(5000,"1234"));
    }

    @Test
    public void testThat_accountThrowsException_whenAmountIsGreaterThanBalance() {
        account.deposit(2000);
        assertThrows(IllegalStateException.class, () -> account.withdraw(5000, "1234"));
    }

    @Test
    public void testThat_accountThrowsException_whenWithdrawalPinIsIncorrect() {
        account.deposit(5000);
        assertThrows(InputMismatchException.class, () -> account.withdraw(5000,"1212"));
    }

    @Test
    public void testThat_accountThrowsException_whenWithdrawalPinIsEmpty() {
        account.deposit(5000);
        assertThrows(InputMismatchException.class, () -> account.withdraw(5000,""));
    }

    @Test
    public void testThat_checkBalance_returnsCorrectValue() {
        account.deposit(5000);
        account.withdraw(2000,"1234");
        assertEquals(3000, account.getBalance("1234"));
    }

    @Test
    public void testThat_accountUpdatesPin_successfully() {
        account.updatePin("1234", "4321");
        account.deposit(500);
        account.withdraw(200,"4321");
    }

    @Test
    public void testThat_accountDoesNotUpdatesPin_whenOldPinIsEmpty() {
        account.deposit(500);
        assertThrows(NullPointerException.class, () -> account.updatePin("", "4321"));
    }

    @Test
    public void testThat_accountDoesNotUpdatesPin_whenNewPinIsEmpty() {
        account.deposit(500);
        assertThrows(NullPointerException.class, () -> account.updatePin("1234", ""));
    }

    @Test
    public void testThat_accountGetAccountNumber_returnsCorrectValue() {
        account.deposit(500);
        assertEquals(0, account.getAccountNumber());
    }

}

