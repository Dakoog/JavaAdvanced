package collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, Person> phoneBook = new HashMap<>();

    public void addPerson(Person person, String number) {
           // adding new person with her phone number
            phoneBook.put(number, person);
        }
        public Person searchPerson(String number) throws PersonNotFoundException {  //the required handling of this exception is transferred to the client of this method
            Person person = phoneBook.get(number);
            if(person == null){
                throw new PersonNotFoundException(number);// throwing exception that inherit from Exception
            }
            return person;
        }
       /* public Person searchPerson(PersonString number){
            return person;*/

        }


