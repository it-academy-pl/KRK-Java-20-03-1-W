package pl.itacademy.java.lesson7.bank;

import pl.itacademy.java.lesson7.bank.account.Account;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bank {
    private String name;
    private Set<Account> accounts;

    public Bank(String name) {
        this.name = name;
        accounts = new HashSet<>();
    }

    public Account getByNumber(int number) {
        //TODO: implement the method
        return null;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) &&
                Objects.equals(accounts, bank.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accounts);
    }
}
