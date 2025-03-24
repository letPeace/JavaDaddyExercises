package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task9_PersonToMap.solution;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonToMapDemo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 35),
                new Person("Charlie", 30)
        );

        Map<String, Integer> personMap = persons.stream()
                .collect(Collectors.toMap(Person::name, Person::age));

        personMap.forEach((name, age) -> System.out.println(name + " → " + age));
    }
}
