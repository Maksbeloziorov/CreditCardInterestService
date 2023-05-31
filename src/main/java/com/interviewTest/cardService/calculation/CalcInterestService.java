package com.interviewTest.cardService.calculation;

import com.interviewTest.cardService.constants.CardRates;
import com.interviewTest.cardService.entity.Card;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalcInterestService {
    public static BigDecimal calculateInterest(Card card) {
            BigDecimal balance = card.getBalance().getBill();
            switch (card.getCardType()) {
                case MasterCard -> {
                    return balance.multiply(CardRates.masterCardRate).setScale(2, RoundingMode.HALF_DOWN);
                }
                case Visa ->  {
                    return balance.multiply(CardRates.visaRate).setScale(2, RoundingMode.HALF_DOWN);
                }
                case Discover -> {
                    return balance.multiply(CardRates.discoverCardRate).setScale(2, RoundingMode.HALF_DOWN);
                }
                default -> throw new IllegalArgumentException("Invalid card type");
            }
    }
}
