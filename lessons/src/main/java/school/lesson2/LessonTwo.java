package school.lesson2;
import java.util.Arrays;

public class LessonTwo {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumm(10, 10));
        checkPositiveNegative(-1);
        System.out.println(checkPositiveNegativeBool(1));
        printStringMultipleTimes("Hello World!", 5);
        System.out.println(isLeapYear(2024));
        invertBinaryArray();
        fillArray();
        multiplyNumbers();
        fillDiagonal();
        System.out.println(Arrays.toString(initialValue(14, 123)));
    }

    // Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание 2
    public static void checkSumSign() {
        int a = 5;
        int b = -10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание 3
    public static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    // Задание 4
    public static void compareNumbers() {
        int a = 35;
        int b = 35;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Задание 5
    public static boolean checkSumm(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    // Задание 6
    public static void checkPositiveNegative (int a) {
        if (a < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
    }

    // Задание 7
    public static boolean checkPositiveNegativeBool (int a) {
        return (a < 0);
    }

    // Задание 8
    public static void printStringMultipleTimes (String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    // Задание 9
    public static boolean isLeapYear (int a) {
        return (a % 4 == 0 && (a % 400 == 0 || a % 100 != 0));
    }

    // Задание 10
    public static void invertBinaryArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // Задание 11
    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    // Задание 12
    public static void multiplyNumbers() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // Задание 13
    public static void fillDiagonal() {
        int n = 5;
        int [][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == n - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Задание 14
    public static int[] initialValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
