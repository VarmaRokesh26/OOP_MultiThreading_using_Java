package funtionalProgramming.lambda;

public class FuntionalProgrammingApp {

    public static void main(String[] args) {
        WelcomeMessageService welcomeMessageService = new WelcomeMessageService();
        Greeter greeter = new GuestUserGreeter();
        Greeter loggedInUserGreeter = ()-> System.out.println("Welcome Back");
        welcomeMessageService.greet(()-> System.out.println("Welcome Back"));
        greeter.perform();
        loggedInUserGreeter.perform();
    }
}

interface MyFunctionType {
    void myFunction();
}
 