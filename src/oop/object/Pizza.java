package oop.object;

import java.util.Objects;

public class Pizza implements Cloneable {

    private String name;
    private PizzaSize pizzaSize;
    private double price;

    Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch (pizzaSize) {
            case SMALL:
            default:
                return 5.99;

            case MEDIUM:
                return 7.99;

            case LARGE:
                return 9.99;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Pizza))
            return false;

        Pizza pizza = (Pizza) obj;
        return Objects.equals(pizza.name, name) && price == pizza.price && pizzaSize == pizza.pizzaSize;
    }

    @Override
    public int hashCode() {
        // return Objects.hash(name, pizzaSize, price);

        int result = 1;

        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (pizzaSize == null ? 0 : pizzaSize.hashCode());
        result = 31 * result + Double.valueOf(price).hashCode();

        return result;
    }
}
