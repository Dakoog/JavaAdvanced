package utils;

import utils.StringHelper;

public class ExceptionExerciseMain {
     // convert string to integer
    public static void main(String[] args) {
        int value = StringHelper.parseToInt("10");
        System.out.println(value);

        int wrongValue = StringHelper.parseToInt("abc ");
        System.out.println(wrongValue);
     //swapping integer  (with calculate) to string, exception in block - try catch
        try {
            String finalSalary = StringHelper.calculateSalary(11, 0);
            System.out.println(finalSalary);

            StringHelper.calculateSalary(11, -50);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}