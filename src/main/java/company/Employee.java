package company;

public class Employee {
    private final String name;
    protected int salary;// protected -> can use in extends class, even outside company package

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.printf("Showing all arguments  by Employee constructor:" +
                " %s and his salary %s £ %n", name, salary);
    }

    public int getSalary() {
        return salary;
    }



    public void show() {
        System.out.printf("%s. He earns %s £ %n", name, getSalary());

    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
