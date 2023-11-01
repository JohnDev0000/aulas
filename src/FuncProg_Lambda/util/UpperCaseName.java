package FuncProg_Lambda.util;

import FuncProg_Lambda.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
