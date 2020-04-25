package pl.itacademy.java.lesson7.bank;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Account {
    private int accountNumber;
    private BigDecimal balance;

    private static int lastAccountNumber;

    public Account() {
        balance = BigDecimal.ZERO;
        //lastAccountNumber++;
        accountNumber = ++lastAccountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber &&
                Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }
}
