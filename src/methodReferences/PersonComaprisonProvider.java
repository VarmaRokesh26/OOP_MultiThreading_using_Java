package methodReferences;

import java.util.Comparator;

public class PersonComaprisonProvider {

    public int comapreByNameAndAge(Person person1, Person person2) {
         return Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge)
                .compare(person1, person2);
    }
}
