package HerancaPolimorfismo.application;

import HerancaPolimorfismo.entities.IndividualPayer;
import HerancaPolimorfismo.entities.LegalPayer;
import HerancaPolimorfismo.entities.Payers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PayersApp {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Payers> payers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char c = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double yearIncome = sc.nextDouble();

            if (c == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExp = sc.nextDouble();
                payers.add(new IndividualPayer(name, yearIncome, healthExp));
            }

            if (c == 'c') {
                System.out.print("Number of employees: ");
                int empNumber = sc.nextInt();
                payers.add(new LegalPayer(name, yearIncome, empNumber));
            }

        }

        Double total = 0.0;

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Payers x : payers) {
            System.out.println(x.TaxesPaid());
            total += x.tax();
        }

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));

        sc.close();
    }
}
