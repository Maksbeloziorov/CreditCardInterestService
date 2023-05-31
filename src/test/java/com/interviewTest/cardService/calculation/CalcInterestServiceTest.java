package com.interviewTest.cardService.calculation;

import com.interviewTest.cardService.entity.CardType;
import com.interviewTest.cardService.entity.Balance;
import com.interviewTest.cardService.entity.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalcInterestServiceTest {
    @Test
    void calculateInterest_MasterCard() {
        Balance balance = new Balance(BigDecimal.valueOf(100));
        Card masterCard = new Card(CardType.MasterCard, balance);
        BigDecimal interest = CalcInterestService.calculateInterest(masterCard);

        Assertions.assertEquals(BigDecimal.valueOf(5).setScale(2, RoundingMode.CEILING), interest);
    }

    @Test
    void calculateInterest_Visa() {
        Balance balance = new Balance(BigDecimal.valueOf(100));
        Card Visa = new Card(CardType.Visa, balance);
        BigDecimal interest = CalcInterestService.calculateInterest(Visa);

        Assertions.assertEquals(BigDecimal.valueOf(10).setScale(2, RoundingMode.CEILING), interest);
    }
    @Test
    void calculateInterest_Discover() {
        Balance balance = new Balance(BigDecimal.valueOf(100));
        Card Discover = new Card(CardType.Discover, balance);
        BigDecimal interest = CalcInterestService.calculateInterest(Discover);

        Assertions.assertEquals(BigDecimal.valueOf(1).setScale(2, RoundingMode.CEILING), interest);
    }
}
