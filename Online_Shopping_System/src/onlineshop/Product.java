package onlineshop;

public class Product {
    private String name;
    private float unitPrice;

    // Constructor
    public Product(String name, float unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
