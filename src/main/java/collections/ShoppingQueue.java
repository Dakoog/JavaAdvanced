package collections;


import java.util.Deque;
import java.util.LinkedList;


public class ShoppingQueue {

   private Deque<Person> customers = new LinkedList<>();//-> LinkedList because complexity this operation is 0(1)
    public void addCustomer (Person  customer){
    customers.addLast(customer);
    // adding last customer to the customers queue

    }
    public Person serviceCustomer(){
        Person personToService = customers.pollFirst();
        // pollFirst because retrieves and removes the head of this queue, or returns null if this queue is empty.
        if(personToService == null ){
            throw new EmptyQueueException();
        }
        return personToService;

    }

}
