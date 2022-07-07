package person;

public class ThisNumberExist extends RuntimeException {
    public ThisNumberExist(String number) {
        super("This number " + number + " is busy. Belongs already to another user. Enter new number.");
    }
}
