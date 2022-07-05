package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Robert Wójcik", Gender.M, 34));
        people.add(new Person("Paulina Kobza", Gender.W, 29));
        people.add(new Person("Hermenegilda  Kociubińska ", Gender.W, 132));
        Collections.sort(people);
        System.out.println(people);
    }
}
