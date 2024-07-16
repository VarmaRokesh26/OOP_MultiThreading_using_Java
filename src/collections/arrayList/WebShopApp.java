package collections.arrayList;

import java.util.*;

public class WebShopApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("FIdget Spinner", 3.99, "It's Fun"));
        products.add(new Product("Earbud", 39.99, "Extremly clear Sound, and Waterproof"));
        products.add(new Product("Earbud", 39.99, "Extremly clear Sound, and Waterproof"));

        products.add(1, new Product("36 AAA batteries", 10.99, "High-performance alkaline batteries."));

        products.remove(2);

        products.set(0, new Product("Rubber duck", 5.99, "You can't bath without this."));
        // System.out.println(products);

        for(Product product : products) {
            System.out.println(product);
        }

        System.out.println("The third element in the lisst:");
        System.out.println(products.get(2));

        System.out.println(products.size() + "products can be found in the list");
    }
}
