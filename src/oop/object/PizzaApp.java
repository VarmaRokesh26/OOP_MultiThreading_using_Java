package oop.object;

public class PizzaApp {

    public static void main(String arg[]) throws CloneNotSupportedException, NoSuchMethodException{
        System.out.println("Available Sizes : ");
        for(PizzaSize pizzaSize : PizzaSize.values()) {
            System.out.println("- " + pizzaSize.getPizzaSizeText());
        }

        System.out.println();

        Pizza pizzaOrder = new Pizza("Margareta", PizzaSize.MEDIUM);
        System.out.println("I ordered the following pizza:");
        System.out.println("Name: " + pizzaOrder.getName());
        System.out.println("Size: " + pizzaOrder.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: $" + pizzaOrder.getPrice());

        System.out.println("-------------------------------");
        
        Pizza samePizza = (Pizza) pizzaOrder.clone();
        System.out.println("I ordered the following pizza:");
        System.out.println("Name: " + samePizza.getName());
        System.out.println("Size: " + samePizza.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: $" + samePizza.getPrice());

        System.out.println(pizzaOrder.equals(samePizza));
    }
}
