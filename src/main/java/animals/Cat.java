package animals;

public class Cat extends Animal implements Runner {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println(name + ": Miauu");

    }

    @Override
    public void run() {
        System.out.println("I am cat. My name is: "+name+". I run: cps,cps");
    }
}
