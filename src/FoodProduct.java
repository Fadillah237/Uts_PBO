public class FoodProduct extends Product {
    private String expirationDate;

    public FoodProduct(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Expiration Date: " + expirationDate);
    }
}
