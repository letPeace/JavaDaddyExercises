package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask5_Persons;

import java.util.HashSet;

public class UniquePersons {
    public static void main(String[] args) {
        HashSet<Person> names = new HashSet<>();
        names.add(new Person("Филипп",20));
        names.add(new Person("Наталья",21));
        names.add(new Person("Дмитрий",37));
        names.add(new Person("Филипп",20));

        for (Person person: names){
            System.out.println(person);
        }
    }
}
