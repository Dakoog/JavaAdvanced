package animals;

public class AnimalsMain {
    public static void main(String[] args) {

        // Animals have spoken
        System.out.println("\nAnimals have spoken");
        Dog dog = new Dog("Nestor");
        Cat cat = new Cat("Cleo");
// -----------------------------------------------------
        Duck duck = new Duck("Donald");
        Duck.Duckling chick = duck.new Duckling();     // create  instate Duckling inner class
        chick.say();
        // Warning! When the inner class is static, to create its instances, just type Duck.Duckling chick = duck.new Duckling ();

        // Runners -> polymorphism with base class Animal
        Animal[] animals = new Animal[4];

        animals[0] = new Dog("Aster");
        animals[1] = new Cat("Blue");
        animals[2] = new Duck("Daisy");
        animals[3] = new Dog("Lampo");
        Dog aster = (Dog) animals[0];
        for (Animal animal : animals) {
            animal.saySomething();
        }
        // Runner
        System.out.println("\nVarious methods of animals activity");
        for (Animal animal : animals) {
            if (animal instanceof Dog) { // if any of the animals is dog, find it and let him function run
                Runner runnerDog = (Dog) animal;
                runnerDog.count();
            }

        }
        cat.run();
        duck.cantRun();
        //anonymous class
        Animal snail = new Animal("snail George. ") {
            @Override
            public void saySomething() {
                System.out.println("I am " + name + "I walk slowly, very slowly. ");
            }

        };
        snail.saySomething();

        // Others methods connection with run()
        System.out.println("\nOthers methods connection with run()");

        Runner[] runners = {dog, cat};// two runners of animals
        // method for runners ... Ready..., for start ... GO!!!
        start(runners);
    }

    public static void start(Runner[] runners) {
        for (Runner runner : runners) {
            runner.run();
            Runner.staticCount();

        }
    }
}
