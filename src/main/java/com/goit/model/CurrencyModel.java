package com.goit.model;

public class CurrencyModel {
    private String currency;
    private Double value;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CurrencyModel{"
                + "currency='" + currency + '\''
                + ", value=" + value + '}';
    }
}
