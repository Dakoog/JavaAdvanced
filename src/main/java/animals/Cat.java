package animals;

public class Cat extends Animal implements Runner {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void saySomething() {

    }

    @Override
    public void run() {
        System.out.println("I run: cps,cps,cps, cps");
    }
}
