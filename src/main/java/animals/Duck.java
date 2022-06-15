package animals;

public class Duck extends Bird {

    public Duckling duckling;

    public Duck(String name, Duckling duckling) {
        super(name);
        this.duckling = new Duckling();// instate for inner class Duckling
    }

    @Override
    public void saySomething() {
        System.out.println(name + ": Kwa kwa");
    }

    public class Duckling {
        public void say() {
            System.out.println("Duckling: " + name + " this is my uncle");   //the inner class has access of fields and methods class Duck
        }
    }
}



