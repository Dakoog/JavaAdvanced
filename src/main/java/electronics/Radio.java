package electronics;

public class Radio extends Device{
    public Radio(String model) {
        super(model);
    }
    public void changeChannel(String channel){
        System.out.println("Changing to a new radio channel: "+ channel);
    }
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
