package animals;

public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void saySomething(); // abstract method -> haven't got implementation


}
