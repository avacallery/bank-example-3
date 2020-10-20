package com.avacallery;

public class BankAccount {
    protected String accountHolder;
    protected String accountNumber;
    protected String socialSecurity;


    public BankAccount(String accountHolder, String accountNumber, String socialSecurity) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.socialSecurity = socialSecurity;
    }

    public BankAccount() {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.socialSecurity = socialSecurity;
    }

    public void accountDetails() {
        System.out.println("Owner: " + accountHolder + "\nAccount Number: " + accountNumber + "\nSocial Security Number: " + socialSecurity);
    }
}
