package com.interviewTest.cardService.entity;

import java.util.List;

public class Wallet {
    private List<Card> cards;

    public List<Card> getCards() {
        return cards;
    }

    public Wallet(List<Card> cards) {
        this.cards = cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

}
