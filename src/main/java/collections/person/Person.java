package collections.person;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person implements Comparable<Person> {
    private String username;
    private Gender gender;
    private int age;

    @Override
    public int compareTo(Person o) {
        return -(this.age - o.age);
    }

    public Person(String username, Gender gender, int age) {
        this.username = username;
        this.gender = gender;
        this.age = age;
    }

    int order = 0;

    @Override
    public String toString() {
        return   username + "| " + gender + " | " + age + " years old\n ";

    }
}
