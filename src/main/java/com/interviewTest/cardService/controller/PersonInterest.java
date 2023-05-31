package com.interviewTest.cardService.controller;

import com.interviewTest.cardService.entity.Person;
import com.interviewTest.cardService.entity.Wallet;

import java.math.BigDecimal;
import java.util.List;

public class PersonInterest {
     public static BigDecimal calculatePersonInterest(Person person) {
          List<Wallet> wallets = person.getWallets();
          BigDecimal totalInterest = BigDecimal.ZERO;
          for (Wallet wallet : wallets) {
               totalInterest = totalInterest.add(WalletInterest.calculateWallet(wallet));
          }
          return totalInterest;
     }

}
