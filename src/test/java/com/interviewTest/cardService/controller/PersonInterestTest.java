package com.interviewTest.cardService.controller;

import com.interviewTest.cardService.entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class PersonInterestTest {

        private static final Balance balance = new Balance(BigDecimal.valueOf(100));
        private static final Card masterCard = new Card(CardType.MasterCard, balance);
        private static final Card visa = new Card(CardType.Visa, balance);
        private static final Card discover = new Card(CardType.Discover, balance);
    @Test
    void calculatePersonTest() {
        Person person1 = personCardTest1();
        Person person2 = personCardTest2();
        Person person3 = personCardTest3();
        Person person4 = personCardTest4();

        BigDecimal personInterest1 = PersonInterest.calculatePersonInterest(person1);
        BigDecimal personInterest2 = PersonInterest.calculatePersonInterest(person2);
        BigDecimal personInterest3 = PersonInterest.calculatePersonInterest(person3);
        BigDecimal personInterest4 = PersonInterest.calculatePersonInterest(person4);

        Assertions.assertEquals(BigDecimal.valueOf(16.00).setScale(2, RoundingMode.CEILING), personInterest1);
        Assertions.assertEquals(BigDecimal.valueOf(30.00).setScale(2, RoundingMode.CEILING), personInterest2);
        Assertions.assertEquals(BigDecimal.valueOf(15.00).setScale(2, RoundingMode.CEILING), personInterest3);
        Assertions.assertEquals(BigDecimal.valueOf(3.00).setScale(2, RoundingMode.CEILING), personInterest4);

    }

    @Test
     private static Person personCardTest1() {
        return new Person(Arrays.asList(new Wallet(Arrays.asList(visa, masterCard, discover))));
    }
    @Test
    private static Person personCardTest2() {
        return new Person(Arrays.asList(new Wallet(Arrays.asList(visa, visa, visa))));
    }

    @Test
    private static Person personCardTest3() {
        return new Person(Arrays.asList(new Wallet(Arrays.asList(masterCard, masterCard, masterCard))));
    }

    @Test
    private static Person personCardTest4() {
        return new Person(Arrays.asList(new Wallet(Arrays.asList(discover, discover, discover))));
    }
}
