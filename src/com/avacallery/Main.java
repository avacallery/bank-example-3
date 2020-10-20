package com.avacallery;

public class Main {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Ava", "1234567", "000-000-999");
        myAccount.accountDetails();
        Checking myChecking = new Checking("Ava", "1234567", "000-000-999", "111222", 1000);
        myChecking.accountDetails();
    }
}
