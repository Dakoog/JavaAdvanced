package electronics;

public class Phone extends Device implements EmailSender {
    private String number;

    public Phone(String model, String number) {
        super(model);
    }

    public void makeCall(String number) {
        System.out.println("I'm calling the number: " + number);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Email sender via "+model+": "+ message);
    }
}
