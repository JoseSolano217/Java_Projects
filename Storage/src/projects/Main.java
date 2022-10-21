package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
Storage storage;
    public static void main(String[] args) {
        Main m = new Main();
        List<Product> productList= new ArrayList<>();
        m.storage = new Storage(productList);
        Product product = m.productCreation();
        m.storage.addProduct(product);
        for (Product product1: m.storage.getProducts()) {
            System.out.println(product1);
        }
    }

    public Product productCreation() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the product type");
        String type = keyboard.nextLine();
        System.out.println("Input the product weight (in kilos)");
        int weight = keyboard.nextInt();
        return new Product(type, weight);
    }
}
