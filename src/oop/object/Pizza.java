package oop.object;

public class Pizza implements Cloneable{

    private String name;
    private PizzaSize pizzaSize;
    private double price;

    Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch(pizzaSize) {
            case SMALL:
            default :
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
}
