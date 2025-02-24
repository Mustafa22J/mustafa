package onlineshop;

import java.util.ArrayList;

public class OnLineShopV1 {
    private ArrayList<Customer> customerList;
    private ArrayList<Product> productList;
    private OrderFacade orderFacade;

    // Constructor
    public OnLineShopV1() {
        this.customerList = new ArrayList<>();
        this.productList = new ArrayList<>();
        this.orderFacade = new OrderFacade();
    }

    public void printCustomerList() {
        System.out.print("Customer List: ");
        for (Customer customer : customerList) {
            System.out.print(orderFacade.getCustomerData(customer) + ", ");
        }
        System.out.println();
    }

    public void printProductList() {
        System.out.print("Product List: ");
        for (Product product : productList) {
            System.out.print(product.getName() + ", ");
        }
        System.out.println();
    }

    public void simulation() {
        // Create Products
        productList.add(new Product("Book", 20.0f));
        productList.add(new Product("Notebook", 5.0f));
        productList.add(new Product("Gift", 50.5f));

        // Create Customers
        Customer john = new Customer("John", 100.0f);
        Customer mary = new Customer("Mary", 2000.0f);

        customerList.add(john);
        customerList.add(mary);

        // Populate customer carts
        orderFacade.includeProduct(john, productList.get(2)); // Gift
        orderFacade.includeProduct(mary, productList.get(1)); // Notebook

        // Print Initial Lists
        System.out.println("=========================");
        System.out.println("== [OnLine Shopping] ==");
        System.out.println("=========================");
        System.out.println("Including Product 1: Book, value: 20.0");
        System.out.println("Including Product 2: Notebook, value: 5.0");
        System.out.println("Including Product 3: Gift, value: 50.5");
        System.out.println("List (initial) of Products................");
        printProductList();
        System.out.println("List of Customers................");
        System.out.println("Including Customer 1: John, credit: 100.0");
        System.out.println("Including Customer 2: Mary, credit: 2000.0");
        printCustomerList();

        System.out.println("List of items in carts................");
        System.out.println("List of Products from John: [" + orderFacade.getListOfProductsData(john.getCart().getProductList()) + "]");
        System.out.println("List of Products from Mary: [" + orderFacade.getListOfProductsData(mary.getCart().getProductList()) + "]");

        // Finalize Shops
        orderFacade.finalizeShop(john);
        orderFacade.finalizeShop(mary);

        // Print Final Credits
        System.out.println("Final credits................");
        System.out.println("John - Credit: " + john.getCredit());
        System.out.println("Mary - Credit: " + mary.getCredit());
        System.out.println("=========================");
        System.out.println("== [Simulation (v.1)] ==");
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        OnLineShopV1 shop = new OnLineShopV1();
        shop.simulation();
    }
}
