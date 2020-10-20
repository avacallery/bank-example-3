package com.avacallery;

public class Checking extends BankAccount {
    private String checkingAccountNum;
    private int balance;

    public Checking(String accountHolder,
                    String accountNumber,
                    String socialSecurity,
                    String checkingAccountNum,
                    int balance) {
        super(accountHolder, accountNumber, socialSecurity);
        this.checkingAccountNum = checkingAccountNum;
        this.balance = balance;
    }

    @Override
    public void accountDetails() {
        System.out.println("Checking Account Number: " + checkingAccountNum + "\nBalance: " + balance);
    }

}
