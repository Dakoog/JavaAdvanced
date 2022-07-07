package collections.map;

import person.Gender;
import person.Person;
import person.PhoneBook;
import person.ThisNumberExist;

class Main {

    public static void main(String[] args) {
        Person jan = new Person("Jan Kowalski", Gender.M, 72);
        Person ola = new Person("Aleksandra Olecka", Gender.W, 19);
        Person ala = new Person("Alicja Alkacka", Gender.W, 11);
        Person romek = new Person("Roman Tyczny", Gender.M, 36);

        PhoneBook phoneBook = new PhoneBook();  // komponuje Map
        try {
            phoneBook.addPerson("222-222-222", romek);
            // two same phone numbers. if you don't check if a given number already exists, put will assign it to the next value
            phoneBook.addPerson("222-222-222", jan);
            phoneBook.addPerson("333-333-333", ala);
            phoneBook.addPerson("444-444-444", ola);
            phoneBook.addPerson("111-111-111",jan);
        } catch (ThisNumberExist thn) {

            System.err.println("Warning!\n" + thn.getMessage());
        }


        phoneBook.removePerson("333-333-333");

        try {
            String firstNumber = "222-222-222";
            String secondNumber = "555-555-555";
            Person personOne = phoneBook.searchPerson(firstNumber);   //calling the searchPerson method needs an exception handling - PersonNotFoundException
            System.out.println("Number " + firstNumber + " belongs to " + personOne);
            Person personTwo = phoneBook.searchPerson("555-555-555");
            System.out.println(personTwo);
        } catch (
                Exception e) {                                             // catching all exceptions that inherit of Exception
            System.err.println("Warning!: " + e.getMessage());    // e.getMessage() get's message from exception
        }
    }
}
