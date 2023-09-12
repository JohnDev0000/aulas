package HerancaPolimorfismo.entities;

public class LegalPayer extends Payers{

    private Integer empQtd;

    public LegalPayer() {
        super();
    }

    public LegalPayer(String name, Double yearIncome, Integer empQtd) {
        super(name, yearIncome);
        this.empQtd = empQtd;
    }

    public Integer getEmpQtd() {
        return empQtd;
    }

    public void setEmpQtd(Integer empQtd) {
        this.empQtd = empQtd;
    }

    @Override
    public Double tax() {
        if (empQtd > 10) {
            return super.getYearIncome() * 0.14;
        } else {
            return super.getYearIncome() * 0.16;
        }
    }

    @Override
    public String TaxesPaid() {
        return super.getName() + ": $ "
                + String.format("%.2f", tax());
    }
}
