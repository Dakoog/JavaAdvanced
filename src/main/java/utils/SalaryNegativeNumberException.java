package utils;

public class SalaryNegativeNumberException extends RuntimeException {
                                                // calling RuntimeException exception constructor
    public SalaryNegativeNumberException(int cash) {
        super("Salary can't be negative: "+ cash);
    }
}
