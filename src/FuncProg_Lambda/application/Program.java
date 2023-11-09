package FuncProg_Lambda.application;

import FuncProg_Lambda.entities.Product;
import FuncProg_Lambda.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {
        /*
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

        // map aplica a função() a cada elemento da lista
        List<String> names =
                list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);

         */
    }
}
