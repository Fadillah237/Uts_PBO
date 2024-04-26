import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Product product1 = new Product("Product 1", 10.0);

            while (true) {
                System.out.println("1. Add Transaction");
                System.out.println("2. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Enter product name: ");
                        scanner.next(); // Membaca input nama produk tanpa menyimpannya
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();

                        Transaction transaction = new Transaction(product1, quantity);
                        transaction.display();
                        break;
                    case 2:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option");
                }
            }
        }
    }
}
