package entities;

public class Company extends TaxPayer{
    private Integer numberOfEmployees;

    public Company(String name, Double income, Integer numberOfEmployees) {
        super(name, income);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public Double tax() {
        double taxRate;
        if (this.numberOfEmployees > 10) {
            taxRate = 0.14;
        } else {
            taxRate = 0.16;
        }
        return super.getIncome() * taxRate;
    }
}
