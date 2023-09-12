package HerancaPolimorfismo.entities;

public class IndividualPayer extends Payers{

    private Double healthCosts;

    public IndividualPayer() {
        super();
    }

    public IndividualPayer(String name, Double yearIncome, Double healthCosts) {
        super(name, yearIncome);
        this.healthCosts = healthCosts;
    }

    public Double getHealthCosts() {
        return healthCosts;
    }

    public void setHealthCosts(Double healthCosts) {
        this.healthCosts = healthCosts;
    }

    @Override
    public Double tax() {

        if (super.getYearIncome() < 20000.00) {
            return super.getYearIncome() * 0.15 - healthCosts * 0.50;
        }
        else {
            return super.getYearIncome() * 0.25 - healthCosts * 0.50;
        }
    }

    @Override
    public String TaxesPaid() {
        return super.getName() + ": $ "
                + String.format("%.2f", tax());
    }
}
