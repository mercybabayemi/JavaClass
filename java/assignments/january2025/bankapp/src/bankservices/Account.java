package bankservices;

import java.util.InputMismatchException;

public class Account {
    private int balance;
    private String pin;
    private int accountNumber;
    private String firstName;
    private String lastName;

    public Account( String firstName ,String lastName,String pin) {
        this.pin = pin;
        this.balance = 0;
        this.accountNumber = 0;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance(String pin) {
        if(this.pin.equals(pin)) return this.balance;
        else throw new InputMismatchException("PIN does not match");
    }

    public void withdraw(int amount, String pinInput) {
        if (amount > this.balance || amount < 0) throw new IllegalStateException("Amount must be greater than zero and less than balance.");
        else if(pinInput.equals(pin)) this.balance -= amount;
        else if(!pinInput.equals(pin)) throw new InputMismatchException("PIN does not match.");
    }

    public void updatePin(String oldPin, String newPin) {
        if(pin.equals("")) throw new NullPointerException("PIN is empty.");
        else if (oldPin.equals("")) throw new NullPointerException("Old pin is empty.");
        else if (newPin.equals("")) throw new NullPointerException("New pin is empty.");
        else if(oldPin.equals(pin)) this.pin = newPin;
        else throw new InputMismatchException("PIN does not match.");
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void updateFirstName(String oldName, String newName) {
        if(firstName.equals("")) throw new InputMismatchException("First name is empty.");
        else if (oldName.equals("")) throw new NullPointerException("Old first name is empty.");
        else if (newName.equals("")) throw new NullPointerException("New first name is empty.");
        else if (firstName.equals(oldName)) this.firstName = newName;
        else throw new InputMismatchException("First name does not match.");
    }

    @Override
    public String toString() {
        return String.format("Account Name: %s%nAccount Balance: %s%nAccount Number: %s", firstName+" "+lastName, this.balance, this.accountNumber);
    }
}
