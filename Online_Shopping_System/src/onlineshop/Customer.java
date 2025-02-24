package onlineshop;

public class Customer {
    private String name;
    private float credit;
    private Cart cart;

    // Constructor
    public Customer(String name, float credit) {
        this.name = name;
        this.credit = credit;
        this.cart = new Cart();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public Cart getCart() {
        return cart;
    }

    // Methods
    public boolean doPayment(float amount) {
        if (credit >= amount) {
            credit -= amount;
            return true;
        } else {
            return false;
        }
    }
}
