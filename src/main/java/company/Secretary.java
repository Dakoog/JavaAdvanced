package company;

public final class Secretary extends Employee{

    public Secretary(String name, int salary) {
        super(name, salary);
        System.out.printf("Showing all arguments  by Secretary constructor:" +
                " %s and his salary %s £", name, salary);
    }
    public void makeCall(String numberPhone){
        System.out.println("I call of number "+numberPhone);
    }
    public final int getSalary(){
        return salary;
    }
}
