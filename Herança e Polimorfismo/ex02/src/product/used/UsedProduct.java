package product.used;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import product.Product;

public class UsedProduct extends Product {

    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag() {
        return String.format("%s (used) - $ %.2f (Manufacture date: %s)", 
        getName(),
        getPrice(),
        manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
