package methodReferences;

// import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MethodReferences {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Steve", 40),
                new Person("Brit", 30),
                new Person("Varma", 20),
                new Person("Shreyas", 10),
                new Person("Rohit", 25),
                new Person("Anna", 5),
                new Person("Anna", 45));

                // .sorted((person1, person2) -> person2.getAge().compareTo(person1.getAge()))
        people.stream()
                .sorted(PersonComaprisonProvider::comapreByNameAndAge)
                .forEach(System.out::println);

        List<Integer> number = List.of(12, 23, 45, 45, 67, 12, 34, 87, 102);
        Set<Integer> numberSet = CollectionTransformer.transform(number, HashSet::new);

        System.out.println(numberSet);

        Set<Person> personSet = CollectionTransformer.transform(people, TreeSet::new);
        System.out.println(personSet);
    }
}
