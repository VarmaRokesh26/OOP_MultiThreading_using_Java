package funtionalProgramming.lambda;

public class FuntionalProgrammingApp {

    public static void main(String[] args) {
        WelcomeMessageService welcomeMessageService = new WelcomeMessageService();
        Greeter greeter;
        boolean isLoggedInUser = true;
        if(isLoggedInUser) {
            greeter = new LoggedInUserGreeter();
        } else {
            greeter = new GuestUserGreeter();
        }
        welcomeMessageService.greet(greeter);

        MyFunctionType loggedInUserGreeter = ()-> System.out.println("Welcom");
    }
}

interface MyFunctionType {
    void myFunction();
}
 