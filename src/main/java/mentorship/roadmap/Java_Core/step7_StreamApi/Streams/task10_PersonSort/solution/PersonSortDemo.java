package mentorship.roadmap.Java_Core.step7_StreamApi.Streams.task10_PersonSort.solution;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonSortDemo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Charlie", 30),
                new Person("Alice", 25),
                new Person("Bob", 25),
                new Person("Diana", 35)
        );

        List<Person> sortedPersons = persons.stream()
                .sorted(Comparator.comparingInt(Person::age)
                        .thenComparing(Person::name))
                .collect(Collectors.toList());

        sortedPersons.forEach(System.out::println);
    }
}
