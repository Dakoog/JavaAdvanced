package company;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary) {
        super(name, salary);
        System.out.printf("Showing all arguments  by Manager constructor: " +
                " %s and his salary %s £", name, salary);
    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
        System.out.printf("Showing all arguments  by Manager constructor: " +
                " %s and his salary %s £ plus bonus %s £ %n", name, salary, bonus);
    }

    public void makeSpeech() {
        System.out.println("Work, everyone!");
    }

    //the overloaded method is called, if an additional argument is given
    public void makeSpeech(String additionalMessage) {
        System.out.println(additionalMessage);
    }

    @Override
    public void show() {                     // przesłonięta metoda podmienia zachowanie metody z klasy bazowej Manager
        super.show();                      // super.show() powoduje wywołanie metody show() z klasy bazowej
        System.out.println("I am manager.");
    }

    @Override
    public int getSalary() {
        return salary + bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
