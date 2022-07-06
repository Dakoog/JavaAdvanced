package collections.list;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(5);
        myList.add(3);
        myList.add(8);
        myList.add(5);

        System.out.println("List myList = " + myList);
        System.out.print("Values of List (by forI) =[");
        for (Integer value : myList) {
            System.out.print(value + " ");
        }
        System.out.print("]\nValues of List (by forEach) = [ ");
        for (Integer values : myList) {
            System.out.print(values + " ");
        }
        Collections.sort(myList);
        System.out.println("]\nSorted myList (normal order) = " + myList);
        myList.sort((o1, o2) -> -o1.compareTo(o2));// lambda

        System.out.println("Sorted myList (revers order) = " + myList);

    }
}
