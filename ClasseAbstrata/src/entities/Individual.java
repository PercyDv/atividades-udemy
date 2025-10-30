package entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(String name, Double income, Double healthExpenditures) {
        super(name, income);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    @Override
    public Double tax() {
        double basicTax;
        if (super.getIncome() < 20000.0) {
            basicTax = super.getIncome() * 0.15;
        } else {
            basicTax = super.getIncome() * 0.25;
        }
        basicTax -= this.healthExpenditures * 0.5;
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax;
    }
}
