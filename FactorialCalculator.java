public class FactorialCalculator {
    public static int factorial(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Факторіал визначений тільки для невід'ємних цілих чисел.");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        long factorialResults = factorial(number);
        System.out.println("Factorial of " + number + ": " + factorialResults);
    }
}