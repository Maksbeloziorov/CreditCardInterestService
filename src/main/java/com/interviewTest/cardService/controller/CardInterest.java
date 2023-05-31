package com.interviewTest.cardService.controller;

import com.interviewTest.cardService.calculation.CalcInterestService;
import com.interviewTest.cardService.entity.Card;

import java.math.BigDecimal;

public class CardInterest {
    public static BigDecimal calculateCard(Card card) {
              return CalcInterestService.calculateInterest(card);
    }
}
