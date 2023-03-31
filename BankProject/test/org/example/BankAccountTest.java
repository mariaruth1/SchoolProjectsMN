package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void getAccountNumber() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void getInterestRate() {
    }

    @Test
    void invalidAccount(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(1818,-1);
        });
    }

    @DisplayName("Test valid inputs (> 0) of deposit method")
    @Test
    public void testValidDeposit() {

        // Arrange
        double initialBalance = 500.00;
        double amount = 500.00;
        BankAccount account = new BankAccount(1111, initialBalance);

        // Act
        account.deposit(amount);

        // Assert
        double expectedBalance = 1000.00;
        double actualBalance = account.getBalance();

        Assertions.assertEquals(expectedBalance, actualBalance);
    }

    @DisplayName("Test invalid inputs (< 0) of deposit method")
    @Test
    public void testInvalidDeposit() {

        // Arrange
        double initialBalance = 500.00;
        double amount = -100.00;
        BankAccount account = new BankAccount(1111, initialBalance);

        // Act + assert
        Exception err = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(amount);
        });
    }

    @Test
    void withdrawWithExceptionAmountHigherThanBalance() {
        // Arrange
        double initialBalance = 500.00;
        double amount = 500.01;
        BankAccount account = new BankAccount(1313, initialBalance);


        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(amount);
        });
    }

    @Test
    void withdrawAll() {
        // Arrange
        double initialBalance = 500.00;
        double amount = 500.00;
        BankAccount account = new BankAccount(1313, initialBalance);

        // Act
        account.withdraw(amount);

        // Assert
        double expectedBalance = 0.00;
        double actualBalance = account.getBalance();

        Assertions.assertEquals(expectedBalance, actualBalance);
    }

    @Test
    void withdrawWithExceptionNegativeAmount() {
        // Arrange
        double initialBalance = 500.00;
        double amount = -600.00;
        BankAccount account = new BankAccount(1414, initialBalance);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(amount);
        });
    }


    @Test
    void setInterestRate() {
        double interestRate = 0.2;

        BankAccount account = new BankAccount(1616, interestRate);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.setInterestRate(-0.2);
        });
    }

    @Test
    void addInterest() {
        double initialBalance = 0.00;

        BankAccount account = new BankAccount(1515, initialBalance);

        account.addInterest();

        Assertions.assertEquals(0.00, account.getBalance());

    }
}