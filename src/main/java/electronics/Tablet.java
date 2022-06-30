package electronics;

public class Tablet extends Device implements EmailSender {

    public Tablet(String model) {
        super(model);
    }

    public void sendMessage(String type, String message) {
        String consoleMessage = String.format("I send message type %s z %s: %s", type, model, message);
        System.out.println(consoleMessage);
    }

    @Override
    public void turnOn() {
        System.out.println("Tablet "+ model +" is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tablet "+ model +" is turn off");

    }

    @Override
    public void sendEmail(String message) {
        sendMessage("email",message);
    }

}
