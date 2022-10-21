package projects;

import java.util.List;
import java.util.Locale;

public class Storage {
    private List<Product> products;

    public Storage(List<Product> products) {
        this.products = products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts() {
        return products;
    }

    public boolean typeCheck(String type) {
        return !type.toLowerCase(Locale.ROOT).equals("rice") && !type.toLowerCase(Locale.ROOT).equals("bean") && !type.toLowerCase(Locale.ROOT).equals("lentils") && !type.toLowerCase(Locale.ROOT).equals("chickpea");
    }

    public boolean weightCheck(int weight) {
        return weight >= 0 && weight <= 100;
    }

    public String addProduct(Product product) {
        if (typeCheck(product.getType())) {
            return "Type is invalid";
        }
        if (!weightCheck(product.getWeight())) {
            return "Weight is invalid";
        }
        products.add(product);
        return "Product successfully stored";
    }
}
