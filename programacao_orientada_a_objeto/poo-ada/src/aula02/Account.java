package aula02;

import java.util.Objects;

public class Account {

    private Client client;
    private String numberAccount;
    private double balance;

    public Account(Client client, String numberAccount) {
        this.client = client;
        this.numberAccount = numberAccount;
        this.balance = 0.0;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        if (money > 0) {
            this.balance += money;
        } else {
            System.out.printf("Insufficient money to deposit");
        }
    }

    public void withdraw(double requestMoney) {
        if (requestMoney <= balance) {
            balance -= requestMoney;
        } else {
            System.out.printf("Insufficient funds");
        }
    }

    @Override
    public boolean equals(Object account) {
      if (account instanceof Account accountToCompare) {
          return this.numberAccount.equals(accountToCompare.numberAccount);
      }
      return false;
    }

    @Override
    public String toString() {
        return "Account:" +
                client +
                "Number Account = " + numberAccount + '\n' +
                "Balance = R$" + balance + "\n";
    }
}
