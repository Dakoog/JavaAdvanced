package collections.set;

import person.Gender;
import person.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Person jan = new Person("Jan Kowalski", Gender.M, 72);
        Person ola = new Person("Aleksandra Olecka", Gender.W, 19);
        Person ala = new Person("Alicja Alkacka", Gender.W, 11);
        Person romek = new Person("Roman Tyczny", Gender.M, 36);


        Set<Person> mySet = new HashSet<>();
        // Set have got only unique values
        mySet.add(romek);
        mySet.add(jan);
        mySet.add(ola);
        mySet.add(ala);
        mySet.add(ala);
        mySet.add(ola);
        mySet.add(romek);
        mySet.add(jan);
        System.out.print("Set mySet:\n " + mySet);

        // Set is collection without sorting, only hashSet has got sort method.
        Set<Person> sortedMySet = new TreeSet<>(mySet);// this set was sorted by age
        System.out.print("\nSet sortedMySet =" + sortedMySet);


    }
}