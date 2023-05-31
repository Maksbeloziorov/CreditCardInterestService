package com.interviewTest.cardService.controller;

import com.interviewTest.cardService.entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CardInterestTest {
    @Test
    void calculateCardTest() {
          Card card1 = createCard1();
          Card card2 = createCard2();
          Card card3 = createCard3();
          Card card4 = createCard4();
          BigDecimal cardInterest1 = CardInterest.calculateCard(card1);
          BigDecimal cardInterest2 = CardInterest.calculateCard(card2);
          BigDecimal cardInterest3 = CardInterest.calculateCard(card3);
          BigDecimal cardInterest4 = CardInterest.calculateCard(card4);
          Assertions.assertEquals(BigDecimal.valueOf(8.00).setScale(2, RoundingMode.CEILING), cardInterest1);
          Assertions.assertEquals(BigDecimal.valueOf(14.00).setScale(2, RoundingMode.CEILING), cardInterest2);
          Assertions.assertEquals(BigDecimal.valueOf(2.00).setScale(2, RoundingMode.CEILING), cardInterest3);
          Assertions.assertEquals(BigDecimal.valueOf(8999.80).setScale(2, RoundingMode.CEILING), cardInterest4);
    }

    private static Card createCard1() {
        Balance balance = new Balance(BigDecimal.valueOf(80));
        return new Card(CardType.Visa, balance);
    }

    private static Card createCard2() {
        Balance balance = new Balance(BigDecimal.valueOf(140));
        return new Card(CardType.Visa, balance);
    }

    private static Card createCard3() {
        Balance balance = new Balance(BigDecimal.valueOf(20));
        return new Card(CardType.Visa, balance);
    }

    private static Card createCard4() {
        Balance balance = new Balance(BigDecimal.valueOf(89998));
        return new Card(CardType.Visa, balance);
    }
}
