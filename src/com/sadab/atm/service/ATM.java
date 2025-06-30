package com.sadab.atm.service;

import com.sadab.atm.model.BankAccount;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + account.getBalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("✅ ₹" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        boolean success = account.withdraw(amount);
        if (success) {
            System.out.println("✅ ₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("❌ Insufficient balance.");
        }
    }
}
