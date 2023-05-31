package com.interviewTest.cardService.entity;

import java.math.BigDecimal;

public class Balance {
    private BigDecimal bill;

    public Balance(BigDecimal bill) {
        this.bill = bill;
    }

    public BigDecimal getBill() {
        return bill;
    }

    public void setBill(BigDecimal bill) {
        this.bill = bill;
    }
}
