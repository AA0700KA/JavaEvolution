package ex_002_stream_api;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Сергей", 30));
        persons.add(new Person("Андрей", 14));
        persons.add(new Person("Александр", 25));
        persons.add(new Person("Анна", 8));
        persons.add(new Person("Евгений", 23));

        int sum = 0;
        int adultPersons = 0;

        for (Person p : persons) {
            if (p.getAge() >= 18) {
                sum += p.getAge();
                adultPersons++;
            }
        }

        double averageAge = (double) sum / adultPersons;

        System.out.println(averageAge);

        double average2 = persons.stream()
                                 .filter(p -> p.getAge() >= 18)
                                 .mapToInt(p -> p.getAge())
                                 .average().getAsDouble();

        System.out.println(average2);

    }
}
