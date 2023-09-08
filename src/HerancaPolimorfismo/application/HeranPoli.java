package HerancaPolimorfismo.application;

import HerancaPolimorfismo.entities.Employee;
import HerancaPolimorfismo.entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HeranPoli {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int empNumber = sc.nextInt();

        for (int i = 1; i <= empNumber; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsorced (y/n)? ");
            char outSorced = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (outSorced == 'y') {
                System.out.print("Additional charge: ");
                double addCharge = sc.nextDouble();
                list.add(new OutsorcedEmployee(name, hours, valuePerHour, addCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee c : list) {
            System.out.println(c.getName() + " - $ " + String.format("%.2f", c.payment()));
        }

        sc.close();
    }
}
