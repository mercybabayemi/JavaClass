package assignments.bankapps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


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
    public void testThat_bankAccountIsEmpty() {
        assertTrue(bank.isAccountEmpty());
    }

    @Test
    public void testThat_bankAccountIsNotEmpty() {
        Account account1 = bank.createAccount("Mercy", "Janet", "1234");
        bank.add(account1);
        assertFalse(bank.isAccountEmpty());
    }

    @Test
    public void testThat_bankAccountsReturnCorrectSizeAfterCreatingAccountXY() {
        Account account1 = bank.createAccount("Mercy", "Janet", "1234");
        Account account2 = bank.createAccount("Yomi", "Olaide", "3245");
        assertEquals(2, bank.size());
    }

    @Test
    public void testThat_bankAccountSizeReturnCorrectSizeAfterRemovingXY() {
        Account account1 = bank.createAccount( "Mercy", "Janet", "1234");
        Account account2 = bank.createAccount( "Yomi", "Olaide", "3245");
        assertEquals(2, bank.size());
        bank.remove(account1);
        assertEquals(1, bank.size());
    }

    @Test
    public void testThat_bankAccountNumberReturnCorrectValueAfterCreatingAccountX() {
        Account account1 = bank.createAccount("Mercy", "Janet", "1234");
        assertEquals(1, account1.getAccountNumber());
    }

    @Test
    public void testThat_bankBalanceReturnCorrectValueAfterCreatingAccountY() {
        Account account1 = bank.createAccount("Mercy", "Janet", "1234");
        assertEquals(1, account1.getAccountNumber());
        assertEquals(0, account1.checkBalance());
    }


}
