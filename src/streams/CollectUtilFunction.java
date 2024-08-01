package streams;

import java.util.List;
import java.util.stream.Collectors;

public class CollectUtilFunction {

    public static void main(String[] args) {
        List<String> playerNames = List.of("Usain", "Choppra", "Dhoni", "Rohit");
        List<Integer> playerDamage = List.of(12, 20, 15, 120, 30, 16, 20, 100);
        List<Double> playerDamageDoubles = List.of(12.0, 20.0, 15.0, 120.0, 30.0, 16.0, 20.0, 100.0);

        System.out.println("Player name : " + String.join(", ", playerNames));
        // System.out.println("Player Damage : " + String.join(", ", playerDamage));

        System.out.println("Player Damage : " + playerDamage.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "))
        );

        Long numberOfHits = playerDamage.stream()
                .collect(Collectors.counting());

        System.out.println("Number of Hits : " + numberOfHits);

        Integer overAllDamage = playerDamage.stream()
                .collect(Collectors.summingInt(Integer::intValue));

        System.out.println("Over all Damage : " + overAllDamage);

        Double overAllDamageDouble = playerDamageDoubles.stream()
                .collect(Collectors.summingDouble(Double::doubleValue));

        System.out.println("Over all Damages : " + overAllDamageDouble);
    }
}
