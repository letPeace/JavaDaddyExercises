package mentorship.roadmap.Java_Core.step7_StreamApi.step2_Streams.task1_FilterPerson.solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFilterDemo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 35),
                new Person("Charlie", 30),
                new Person("Diana", 40)
        );

        List<Person> filtered = persons.stream()
                .filter(p -> p.age() > 30)
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);
    }
}
