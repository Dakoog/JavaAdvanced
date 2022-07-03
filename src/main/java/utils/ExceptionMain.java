package utils;

import utils.StringHelper;

public class ExceptionMain {

    public static void main(String[] args) {
        /*System.out.println(StringHelper.parseToInt("1"));
        System.out.println(StringHelper.parseToInt("1a"));*/

        System.out.println();

        System.out.println(StringHelper.calculateSalary(100, 20));
        System.out.println(StringHelper.calculateSalary(100, -200));

        try {
            doSomething(-2);
        } catch (Exception e) {
            System.out.println("Something went wrong " + e.getMessage());
        }
    }

    private static void doSomething(int age) throws Exception { //  DoSomething method potentially throws an exception that inherits from Exception -> have to handle it
        if (age < 0) {
            throw new IllegalArgumentException("Age can't negative!"); // this exception inherits from RuntimeException, don't need to handle it
        }

        if (age < 0) {
            throw new Exception("Age can't negative.");    // exceptions inheriting from Exception must be handled - by closing them in a try-catch structure
            // or by delegating service to the client of the method (change in the signature of the doSomething method)
        }
    }
}