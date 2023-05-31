package com.interviewTest.cardService;

import com.interviewTest.cardService.controller.CardInterest;
import com.interviewTest.cardService.controller.PersonInterest;
import com.interviewTest.cardService.controller.WalletInterest;
import com.interviewTest.cardService.entity.*;

import java.math.BigDecimal;
import java.util.Arrays;

public class CardService {

        private static final Balance balance = new Balance(BigDecimal.valueOf(100));
        private static final Card masterCard = new Card(CardType.MasterCard, balance);
        private static final Card visa = new Card(CardType.Visa, balance);
        private static final Card discover = new Card(CardType.Discover, balance);

    void firstCase() {
        Person person = createFirstPerson();
        BigDecimal personInterest = PersonInterest.calculatePersonInterest(person);
        BigDecimal visaCard = CardInterest.calculateCard(person.getWallets().get(0).getCards().get(0));
        BigDecimal masterCardC = CardInterest.calculateCard(person.getWallets().get(0).getCards().get(1));
        BigDecimal discoverCard = CardInterest.calculateCard(person.getWallets().get(0).getCards().get(2));

        System.out.println("First case - total simple interest for Person is " + personInterest + "$, Visa is "
                + visaCard + "$, MasterCard is " + masterCardC + "$, Discover is " + discoverCard + "$");
    }

    void secondCase() {
        Person person = createSecondPerson();
        BigDecimal personInterest = PersonInterest.calculatePersonInterest(person);
        BigDecimal firstWalletInterest = WalletInterest.calculateWallet(person.getWallets().get(0));
        BigDecimal secondWalletInterest = WalletInterest.calculateWallet(person.getWallets().get(1));

        System.out.println("Second case - simple interest for Person is " + personInterest + "$, first wallet is "
                + firstWalletInterest + "$, second wallet is " + secondWalletInterest + "$");
    }

    void thirdCase() {
        Person firstPerson = createThirdPersonFirst();
        Person secondPerson = createThirdPersonSecond();
        BigDecimal firstPersonInterest = PersonInterest.calculatePersonInterest(firstPerson);
        BigDecimal secondPersonInterest = PersonInterest.calculatePersonInterest(secondPerson);
        BigDecimal firstPersonInterestWallet = WalletInterest.calculateWallet(firstPerson.getWallets().get(0));
        BigDecimal secondPersonInterestWallet = WalletInterest.calculateWallet(secondPerson.getWallets().get(0));

        System.out.println("Third case - simple interest for first Person is " + firstPersonInterest + "$, wallet is "
                        + firstPersonInterestWallet + "$, second Person is " + secondPersonInterest
                + "$, wallet is " + secondPersonInterestWallet + "$");
    }


    private static Person createFirstPerson() {
        return new Person(Arrays.asList(new Wallet(Arrays.asList(visa, masterCard, discover))));
    }

    private static Person createSecondPerson() {

        return new Person(Arrays.asList(new Wallet(Arrays.asList(masterCard)),
                        new Wallet(Arrays.asList(visa, discover))));
    }

    private static Person createThirdPersonFirst() {
        return new Person(Arrays.asList(new Wallet(Arrays.asList(masterCard, masterCard, visa))));
    }

    private static Person createThirdPersonSecond() {
        return new Person(Arrays.asList(new Wallet(Arrays.asList(visa, masterCard))));
    }
}
