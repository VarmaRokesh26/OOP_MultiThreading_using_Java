package funtionalProgramming.lambda;

import java.util.Scanner;

public class FuntionalProgrammingApp {

    public static void main(String[] args) {
        WelcomeMessageService welcomeMessageService = new WelcomeMessageService();

        Scanner userStatusScanner = new Scanner(System.in);
        String userStatus = userStatusScanner.nextLine();

        Greeter greeter;
        if("guest".equals(userStatus)) {
            greeter = () -> System.out.println("Welcome to our Application. Please create an acccount or log in.");
        } else if ("loggedIn".equals(userStatus)){
            greeter = () -> System.out.println("Welocme Back");
        } else {
            greeter = () -> System.err.println("Something went Wrong");
        }

        welcomeMessageService.greet(greeter);
        userStatusScanner.close();
    }
}

interface MyFunctionType {
    void myFunction();
}
 