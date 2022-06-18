package animals;

public class Duck extends Bird {

    private Duckling duckling;

    public Duck(String name) {
        super(name);
        this.duckling = new Duckling();
    }

    @Override
    void cantRun() {
        System.out.println("I am duck. My name is "+ name +". I can't run. I am swim on rivers or lakes.");
    }

    @Override
    public void saySomething() {
        System.out.println(name + ": kwa kwa");

    }

    public class Duckling {
        private String ducklingName;

        public void say() {
            System.out.println("Dewey: " + name + " this is my uncle.");   // inner class can use all methods with Duck class
        }

    }
}


