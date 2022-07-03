package utils;

public class StringHelper {
    public static int parseToInt(String value) {
        int result;
        try {

            result = Integer.parseInt(value); //converting primitive types (string to integer)
        } catch (NumberFormatException nme) {
            System.out.println(value + "can't be changed to number");
            return 0;
        }
        finally {
            System.out.println("Swap complete");
        }
        System.out.println("Everything went well. ");
        return result;
    }
    public static String calculateSalary(int salary, int bonus){
        int cash = salary + bonus;
        if(cash < 0){

            throw new SalaryNegativeNumberException(cash);
        }
            return Integer.toString(cash);//String.valueOf(cash)

    }
}
