package pl.itacademy.java.lesson7.bank.account;

import java.math.BigDecimal;

public class DepositAccount extends Account {
    public DepositAccount(BigDecimal percents) {
        super(percents);
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        //TODO: implement the method
        return null;
    }

    /**
     * For example current balance is +100 (plus 100)
     * percentage is 3%
     * after applying percentage current balance should be +103
     */
    @Override
    public BigDecimal applyPercentage() {
        //TODO: implement the method
        return null;
    }

    @Override
    public BigDecimal transferMoney(String bankName, int accountNumber, BigDecimal amount) {
        //TODO: implement the method
        return null;
    }
}
