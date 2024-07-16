package oops.object;

import java.util.Arrays;

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
        
        System.out.println("-------------------------------");
        Pizza anotherPizza = new Pizza("Margareta", PizzaSize.LARGE);
        System.out.println(pizzaOrder.equals(anotherPizza));
        System.out.println("-------------------------------");
        
        System.out.println(anotherPizza.getClass().getSimpleName());
        System.out.println(anotherPizza.getClass().getName());
        System.out.println(Arrays.toString(anotherPizza.getClass().getFields()));
        System.out.println(Arrays.toString(anotherPizza.getClass().getDeclaredFields()));
        System.out.println(Arrays.deepToString(anotherPizza.getClass().getMethods()));
        System.out.println(Arrays.toString(anotherPizza.getClass().getDeclaredMethods()));
        System.out.println(anotherPizza.getClass().getSuperclass());
        System.out.println(anotherPizza.getClass());
        System.out.println("-------------------------------");
        
        System.out.println("pizzaOrder's HashCode -->" + pizzaOrder.hashCode());
        System.out.println("samePizza's HashCode -->" + samePizza.hashCode());
        System.out.println("anotherPizza's HashCode -->" + anotherPizza.hashCode());
        System.out.println("-------------------------------");

        System.out.println(pizzaOrder.toString());
        System.out.println(samePizza);
        System.out.println(anotherPizza);
    }
}
