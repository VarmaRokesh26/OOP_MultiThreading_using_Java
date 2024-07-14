package rockpaperscissor;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorApp {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors!");

        while (true) {
            System.out.println("To make a move type in rock or paper or scissor. To quit the game enter quit");

            System.out.print("Your move : ");
            String yourMove = sc.nextLine().toLowerCase();

            if (yourMove.equals("quit")) {
                break;
            }

            if (isValidMove(yourMove)) {
                String opponentMove = generateOpponentMove();
                System.out.println("Your Opponent Move : " + opponentMove);
                whoWon(yourMove, opponentMove);
            } else {
                System.out.println("Your input is Invalid");
            }
            System.out.println();
        }
        sc.close();
    }

    private static boolean isValidMove(String yourMove) {
        return (yourMove.equals("rock")) || (yourMove.equals("paper")) || (yourMove.equals("scissor"));
    }

    private static String generateOpponentMove() {
        Random randomNumberGenerator = new Random();

        switch (randomNumberGenerator.nextInt(3)) {
            case 0:
            default:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissor";
        }
    }

    private static void whoWon(String yourMove, String opponentMove) {
        if(yourMove.equals(opponentMove))
            System.out.println("It's a tie!!");
        else if((yourMove.equals("rock") && opponentMove.equals("scissor")) ||
                    yourMove.equals("scissor") && opponentMove.equals("paper") ||
                    yourMove.equals("paper") && opponentMove.equals("rock")) 
            System.out.println("You Won :)");
        else 
            System.out.println("Opponent Won :(");
    }
}
