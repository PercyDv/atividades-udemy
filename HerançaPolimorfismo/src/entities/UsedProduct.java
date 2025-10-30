package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends Product {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    protected Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }
}
