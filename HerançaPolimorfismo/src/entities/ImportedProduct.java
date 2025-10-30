package entities;

public class ImportedProduct extends Product{
    protected Double customFee;

    public ImportedProduct(String name, Double price, Double customFee){
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public Double totalPrice(){
        return getPrice() + customFee;
    }

    @Override
    public String toString() {
        return super.toString() + " (Custom fee: $ " + String.format("%.2f", customFee) + ")";
    }
}
