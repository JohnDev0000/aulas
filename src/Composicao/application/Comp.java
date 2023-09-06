package Composicao.application;

import Composicao.entities.Department;
import Composicao.entities.HourContract;
import Composicao.entities.Worker;
import Composicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Comp {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine(); // name

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();  // enum level

        System.out.print("Base salary: ");
        Double baseSal = sc.nextDouble();  // baseSalary

        Worker worker = new Worker(
                workerName,
                WorkerLevel.valueOf(workerLevel),
                baseSal,
                new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int contracts = sc.nextInt(); //

        for (int i = 1; i <= contracts; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());  // ler data
            System.out.print("value per hour: ");
            double valuePerHour = sc.nextDouble(); // ler valor por hora
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();  // ler duração em horas
            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
            worker.addContracts(contract);  // associa contract com worker

        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): "); // ler mes e ano
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName()); // mostrar nome
        System.out.println("Department: " + worker.getDepartment().getName()); // mostrar departamento
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month))); //mostrar salario


        sc.close();

    }
}
