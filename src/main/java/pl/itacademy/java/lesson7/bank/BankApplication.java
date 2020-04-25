package pl.itacademy.java.lesson7.bank;

public class BankApplication {
    public static void main(String[] args) {
        NationalBank nb = NationalBank.getInstance();

        Account creditAccount = new CreditAccount();
        Account depositAccount = new DepositAccount();

        Bank alior = new Bank("AliorBank");


    }
}
