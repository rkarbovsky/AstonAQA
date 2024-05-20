package school.lesson7_testng;

public class Factorial {
    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Не должно быть отрицательных чисел при расчёте факториала");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.calculateFactorial(4));
    }
}