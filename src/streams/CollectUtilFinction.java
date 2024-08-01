package streams;


import java.util.List;
import java.util.stream.Collectors;

public class CollectUtilFinction {

    public static void main(String[] args) {
        List<String> playerNames = List.of("Usain", "Choppra", "Dhoni", "Rohit");
        List<Integer> playerDamage = List.of(12, 20, 15, 120, 30, 16, 20, 100);

        System.out.println("Player name : " + String.join(", ", playerNames));
        // System.out.println("Player Damage : " + String.join(", ", playerDamage));

        System.out.println("Player Damage : " + playerDamage.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "))
        );

        Long numberOfHits = playerDamage.stream()
                .collect(Collectors.counting());

        System.out.println("Number of Hits : " + numberOfHits);
    }
}
