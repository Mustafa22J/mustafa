package onlineshop;

import java.util.List;

public class OrderFacade {
    // Methods
    public boolean finalizeShop(Customer customer) {
        float total = customer.getCart().getTotalPrice();
        return customer.doPayment(total);
    }

    public String getCustomerData(Customer customer) {
        return customer.getName() + " [credit:" + customer.getCredit() + "]";
    }

    public String getListOfProductsData(List<Product> productList) {
        StringBuilder sb = new StringBuilder();
        for (Product product : productList) {
            sb.append(product.getName()).append(", ");
        }
        return sb.toString().trim();
    }

    public void includeProduct(Customer customer, Product product) {
        customer.getCart().addProduct(product);
    }

    public void removeProduct(Customer customer, Product product) {
        customer.getCart().delProduct(product);
    }
}
