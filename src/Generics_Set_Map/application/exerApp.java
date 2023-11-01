package Generics_Set_Map.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();


        System.out.print("How many students for course A? ");
        int stud = sc.nextInt();
        for (int i = 0; i < stud; i++) {
            int number = sc.nextInt();
            A.add(number);
        }
        System.out.print("How many students for course B? ");
        stud = sc.nextInt();
        for (int i = 0; i < stud; i++) {
            int number = sc.nextInt();
            B.add(number);
        }
        System.out.print("How many students for course C? ");
        stud = sc.nextInt();
        for (int i = 0; i < stud; i++) {
            int number = sc.nextInt();
            C.add(number);
        }

        Set<Integer> total = new HashSet<>(A);
        total.addAll(B);
        total.addAll(C);

        System.out.println("Total: " + total.size());



        sc.close();
    }
}
