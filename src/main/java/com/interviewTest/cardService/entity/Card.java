package com.interviewTest.cardService.entity;

public class Card {
    private CardType cardType;
    private Balance balance;

    public Card(CardType cardType, Balance balance) {
        this.cardType = cardType;
        this.balance = balance;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }
}
