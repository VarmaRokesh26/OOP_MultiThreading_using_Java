package streams;

import java.util.Objects;

public class Product {

    private final String name;
    private final String brand;
    private final double price;
    private final double rating;

    public Product(String name, String brand, double price, double rating) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
    }

    public String getName() { return name; }

    public String getBrand() { return brand; }

    public double getPrice() { return price; }

    public double getRating() { return rating;}

    @Override
    public String toString() {
        return "Product [name=" + name + 
                ", brand=" + brand + 
                ", price=" + price + 
                ", rating=" + rating + 
                "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, price, rating);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Product)) return false;

        Product product = (Product) obj;

        return product.price == price && product.rating == rating
            && Objects.equals(product.name, name) && Objects.equals(product.brand, brand);
    }

    
}
