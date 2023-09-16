package TryCatch.application;

import TryCatch.model.entities.Account;
import TryCatch.model.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int accNumber = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(accNumber, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("New Balance: %.2f" + account.getBalance());
        }
        catch (WithdrawException e) {
            System.out.println(e.getMessage());
        }


        sc.close();
    }
}


