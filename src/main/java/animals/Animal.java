package animals;

public abstract class Animal { // can't create instantiate for abstract class

   protected String name;// protected because "name" field is used in classes which extend Animal class

    public Animal(String name) {
        this.name = name;
    }

    public abstract void saySomething(); // abstract method -> haven't got implementation


}
