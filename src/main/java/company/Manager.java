package company;

public class Manager extends Employee {
    private int bonus;
    private Secretary secretary;

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

    @Override
    public void show() {            // the overridden method overrides the behavior of the method in the Manager base class
        super.show();               // super.show ()-> causes the show () method to be called from the base class
        System.out.println("He is manager.");

    }

    public Manager(String name, int salary, Secretary secretary) {
        super(name, salary);
        this.secretary = secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    // this is composition -> relation between two classes (A contains B)
    public void makeCall(String phoneNumber) {
        if (secretary == null) { // when overclass can't make action,
            System.out.println("I can't call, because I don't have secretary");
        } else {// instructs the class to be referenced to do this work
            secretary.makeCall(phoneNumber);
        }
    }

    public void makeSpeech() {
        System.out.println("Work, everyone!");
    }
    //the overloaded method is called, if an additional argument is given

    public void makeSpeech(String additionalMessage) {
        System.out.println(additionalMessage);
    }

    @Override
    public int getSalary() {
        return salary + bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
