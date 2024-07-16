package oops.object;

public enum PizzaSize {
    SMALL("Small Size"), MEDIUM("Medium Size"), LARGE("Large SIze");

    private String pizzaSizeText;
    
    PizzaSize(String pizzaSizeText) {
        this.pizzaSizeText = pizzaSizeText;
    }

    public String getPizzaSizeText() {
        return pizzaSizeText;
    }
}
