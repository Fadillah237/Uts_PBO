public class Transaction {
    private Product product;
    private int quantity;

    public Transaction(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotal() {
        return product.getPrice() * quantity;
    }

    public void display() {
        System.out.println("Transaction: " + product.getName() + ", Quantity: " + quantity + ", Total: " + getTotal());
    }
}
