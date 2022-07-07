package person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {
        //1. customers
        Person rob = new Person("Robert Góra", Gender.M, 72);
        Person kasia = new Person("Katarzyna Śliwka", Gender.W, 19);
        Person pati = new Person("Patrycja Pałka", Gender.W, 11);
        Person iwo = new Person("Iwo Nabyk", Gender.M, 36);

        PhoneBook phoneBook = new PhoneBook();  // map -> created phone book with args (phone number and customer)
        //2. adding new customers to phone book
        try {
            phoneBook.addPerson("222-222-222", pati);
            // two same phone numbers. if you don't check if a given number already exists, put will assign it to the next value
            phoneBook.addPerson("222-222-222", iwo);
            phoneBook.addPerson("333-333-333", rob);
            phoneBook.addPerson("444-444-444", kasia);
            phoneBook.addPerson("111-111-111", iwo);
        } catch (ThisNumberExist thn) {

            System.err.println("Warning!\n" + thn.getMessage());
        }
        //3. removing a client with a telephone number:
        phoneBook.removePerson("333-333-333");

        //4. searching customers in phone book with a telephone number:
        try {
            String firstNumber = "222-222-222";
            String secondNumber = "555-555-555";
            Person personOne = phoneBook.searchPerson(firstNumber);   //calling the searchPerson method needs an exception handling - PersonNotFoundException
            System.out.println("Number " + firstNumber + " belongs to " + personOne);
            Person personTwo = phoneBook.searchPerson("555-555-555");
            System.out.println(personTwo);
        } catch (
                Exception e) {                                             // catching all exceptions that inherit of Exception
            System.out.println("Warning! " + e.getMessage());    // e.getMessage() get's message from exception
        }
        // 5. Adding to queue to realise service

        ShoppingQueue shoppingQueue = new ShoppingQueue();//
        shoppingQueue.addCustomer(pati);
        shoppingQueue.addCustomer(kasia);
        shoppingQueue.addCustomer(iwo);
        shoppingQueue.addCustomer(rob);
        // 6. Service for customers
        try {
            System.out.println("\nCustomers who used the service: ");
            System.out.println(shoppingQueue.serviceCustomer());// handling first customer
            System.out.println(shoppingQueue.serviceCustomer());
            System.out.println(shoppingQueue.serviceCustomer());
            System.out.println(shoppingQueue.serviceCustomer());
            System.out.println(shoppingQueue.serviceCustomer());
        } catch (EmptyQueueException eqe) {
            System.err.println("Warning! "+eqe.getMessage());
        }


    }
}

