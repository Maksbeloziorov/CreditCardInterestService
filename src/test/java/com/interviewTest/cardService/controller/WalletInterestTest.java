package com.interviewTest.cardService.controller;

import com.interviewTest.cardService.entity.CardType;
import com.interviewTest.cardService.entity.Balance;
import com.interviewTest.cardService.entity.Card;
import com.interviewTest.cardService.entity.Wallet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class WalletInterestTest {

    @Test
    void calculateWalletTest() {
        Wallet wallet = createWallet();
        BigDecimal walletInterest = WalletInterest.calculateWallet(wallet);
        Assertions.assertEquals(BigDecimal.valueOf(24.35).setScale(2, RoundingMode.CEILING), walletInterest);
    }

    private static Wallet createWallet() {
        Balance balance1 = new Balance(BigDecimal.valueOf(50));
        Balance balance2 = new Balance(BigDecimal.valueOf(60));
        Balance balance3 = new Balance(BigDecimal.valueOf(85));
        Balance balance4 = new Balance(BigDecimal.valueOf(150));

        Card card1 = new Card(CardType.MasterCard, balance1);
        Card card2 = new Card(CardType.Visa, balance2);
        Card card3 = new Card(CardType.Discover, balance3);
        Card card4 = new Card(CardType.Visa, balance4);

        return new Wallet(Arrays.asList(card1, card2, card3, card4));
    }
}
