package collections.queue;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> myQueue = new LinkedList<>();

        myQueue.add(1);
        myQueue.add(5);
        myQueue.add(3);
        myQueue.add(8);
        // showing all elements of myQueue
        System.out.println("Deque myQueue: " + myQueue);
        // showing first(last) elements, but not removing it
        System.out.println("\nShowing first(last) elements, but not removing it");
        System.out.println("peek first: " + myQueue.peekFirst());
        System.out.println("peek last: " + myQueue.peekLast());
        System.out.println("Deque myQueue: " + myQueue);

        // showing first(last) elements and removing it
        System.out.println("\nShowing first(last) elements and removing it ");
        System.out.println("poll first: " + myQueue.pollFirst());
        System.out.println("poll last: " + myQueue.pollLast());
        System.out.println("Deque myQueue: " + myQueue);

    }
}
