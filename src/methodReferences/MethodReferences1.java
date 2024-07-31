package methodReferences;

import java.util.List;

public class MethodReferences1 {

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
        PersonComaprisonProvider comaprisonProvider = new PersonComaprisonProvider();
        people.stream()
                .sorted(comaprisonProvider::comapreByNameAndAge)
                .forEach(System.out::println);
    }
}
