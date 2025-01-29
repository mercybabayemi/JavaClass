package bankservices;

import custom_datastructure.ArrayListMethod;

public class Bank {
    private ArrayListMethod<Account> accounts;
    private int accountCount;

    public Bank() {
        this.accounts = new ArrayListMethod<>();
        this.accountCount = 0;
    }

    public boolean isAccountsEmpty() {
        return accounts.isEmpty();
    }

    public void add(Account account) {
        accounts.add(account);
    }

    public int size() {
        return accounts.size();
    }

    public void remove(int accountNumber) {
        accounts.remove(accountNumber);
    }

    public int createAccount(String firstName, String lastName, String pin) {
        Account account = new Account(firstName, lastName, pin);
        int accountNumber = generateAccountNumber();
        account.setAccountNumber(accountNumber);
        accounts.add(account);
        return account.getAccountNumber();
    }

    public int generateAccountNumber() {
        return ++accountCount;
    }

    public Bank clear() {
        this.accounts.removeAll();
        return this;
    }

    public Account findAccountByAccountNumber(int accountNumber) {
        return (Account) accounts.get(accountNumber - 1);
    }

    public int checkBalance(int accountNumber, String pin) {
        return findAccountByAccountNumber(accountNumber).getBalance(pin);
    }

    public void deposit(int accountNumber, int amount) {
        findAccountByAccountNumber(accountNumber).deposit(amount);
    }

    public void withdraw(int accountNumber, int amount, String pin) {
        findAccountByAccountNumber(accountNumber).withdraw(amount, pin);
    }

    public void transfer(int senderAccount, int receiverAccount, int amount, String pin) {
        findAccountByAccountNumber(senderAccount).withdraw(amount, pin);
        findAccountByAccountNumber(receiverAccount).deposit(amount);
    }
}
