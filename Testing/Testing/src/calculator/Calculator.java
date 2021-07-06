package calculator;

public class Calculator {
    private Calculator() {}

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) throws ArithmeticException {
        if (b != 0) return a / b;
        else throw new ArithmeticException("деление на ноль");
    }
}
