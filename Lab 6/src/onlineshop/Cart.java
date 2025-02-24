package onlineshop;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> productList;
    private float totalPrice;

    // Constructor
    public Cart() {
        this.productList = new ArrayList<>();
        this.totalPrice = 0.0f;
    }

    // Methods
    public void addProduct(Product product) {
        productList.add(product);
        totalPrice += product.getUnitPrice();
    }

    public void delProduct(Product product) {
        if (productList.remove(product)) {
            totalPrice -= product.getUnitPrice();
        }
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
}
