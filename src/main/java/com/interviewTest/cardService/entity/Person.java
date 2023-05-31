package com.interviewTest.cardService.entity;

import java.util.List;

public class Person {
    List<Wallet> wallets;

    public Person(List<Wallet> wallets) {
        this.wallets = wallets;
    }

    public List<Wallet> getWallets() {
        return wallets;
    }

    public void setWallets(List<Wallet> wallets) {
        this.wallets = wallets;
    }
}
