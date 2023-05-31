package com.interviewTest.cardService.controller;

import com.interviewTest.cardService.calculation.CalcInterestService;
import com.interviewTest.cardService.entity.Card;
import com.interviewTest.cardService.entity.Wallet;

import java.math.BigDecimal;
import java.util.List;
public class WalletInterest {
     public static BigDecimal calculateWallet(Wallet wallet) {
          List<Card> cards = wallet.getCards();
          BigDecimal totalInterest = BigDecimal.ZERO;
          for (Card card : cards) {
               totalInterest = totalInterest.add(CalcInterestService.calculateInterest(card));
          }
          return totalInterest;
     }

}
