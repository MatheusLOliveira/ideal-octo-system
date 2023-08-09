package aula02;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;
    private int numberAccount;

    public Bank() {
        this.accounts = new ArrayList<Account>();
        this.numberAccount = 0;
    }

    public String createAccount(String name, String cpf, String email) {
        String number = String.format("%03d", ++this.numberAccount);
        Client client = new Client(name, cpf, email);
        Account account = new Account(client, number);

        this.accounts.add(account);

        return account.getNumberAccount();
    }

    public Account searchAccount(String numAccount) {
        for (Account account : accounts) {
            if (account.getNumberAccount().equals(numAccount)) {
                return account;
            }
        }
        System.out.printf("Account %d not found", numAccount);
        return null;
    }

    public void deposit(String numAccount, double money) {
        Account accountToDeposit = searchAccount(numAccount);

        if (accountToDeposit != null) {
            accountToDeposit.deposit(money);
        }
    }

    public void withdraw(String numAccount, double money) {
        Account accountToWithdraw = searchAccount(numAccount);

        if (accountToWithdraw != null) {
            accountToWithdraw.withdraw(money);
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
