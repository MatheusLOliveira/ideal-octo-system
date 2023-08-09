package aula02;

import java.util.Scanner;

public class TestBank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuePlay = true;
        String name, cpf, email, accountNumber;
        double quantity;

        Bank bank = new Bank();

        do {
            System.out.printf("\nWhich option do you want to?\n" +
                    "1 - Create a new account\n" +
                    "2 - Deposit\n" +
                    "3 - Withdraw\n" +
                    "4 - Show detail of the account\n\n" +
                    "Your option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.printf("Name of the account holder: ");
                    name = sc.nextLine();
                    System.out.printf("CPF of the account holder: ");
                    cpf = sc.nextLine();
                    System.out.printf("Email of the account holder: ");
                    email = sc.nextLine();

                    String numAccount = bank.createAccount(name, cpf, email);
                    System.out.printf("Your account %s has been successfully created\n\n", numAccount);
                    break;
                case 2:
                    System.out.printf("Your account number: ");
                    accountNumber = sc.nextLine();
                    System.out.printf("Quantity to deposit: ");
                    quantity = sc.nextDouble();
                    System.out.println();

                    bank.deposit(accountNumber, quantity);
                    System.out.println();
                    break;
                case 3:
                    System.out.printf("Your account number: ");
                    accountNumber = sc.nextLine();
                    System.out.printf("Quantity to withdraw: ");
                    quantity = sc.nextDouble();

                    bank.withdraw(accountNumber, quantity);
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("Your account number: ");
                    accountNumber = sc.nextLine();

                    Account account = bank.searchAccount(accountNumber);

                    if (account != null) {
                        System.out.println(account);
                    } else {
                        System.out.printf("Account %s not found.", accountNumber);
                    }
                    break;
                default:
                    System.out.printf("Select a valid number");
                    break;
            }
        } while (continuePlay);
        sc.close();
    }
}
