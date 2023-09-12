package HerancaPolimorfismo.entities;

public abstract class Payers {

    private String name;
    private Double yearIncome;

    protected Payers() {

    }

    protected Payers(String name, Double yearIncome) {
        this.name = name;
        this.yearIncome = yearIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(Double yearIncome) {
        this.yearIncome = yearIncome;
    }

    public Double tax() {
        return yearIncome;
    }

    public String TaxesPaid() {
        return name + ": $ "
                + String.format("%.2f", tax());
    }
}
