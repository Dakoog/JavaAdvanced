package collections;

public class PersonNotFoundException extends Exception {
   public PersonNotFoundException (String number){
       super("The person with the number "+ number +" is not in the phone book.");
   }
}
