package FuncProg_Lambda.entities;

public class Product {
    private String name;
    private String email;
    private Double price;

    public Product(String name, String email, Double price) {
        this.name = name;
        this.email = email;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String staticUpperCaseName(Product p) {
        return p.getName().toUpperCase();
    }

    public String nonStaticUpperCaseName() {
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
