public class Main {

    public static void main(String[] args)
    {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
            System.out.println(checkSumInRange(4, 8));
            checkPositiveOrNegative(11);
            System.out.println(isNegative(-6));
            printStringMultipleTimes("Hello", 4);
            System.out.println(isLeapYear(2024));
            invertArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
            fillArray();
            multiplyLessThanSix();
            fillDiagonalArray(5);
            int[] array = createArray(5, 10);
        }
    }
    // 1.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2.
    public static void checkSumSign() {
        int a = 5; // Пример значения
        int b = -3; // Пример значения
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3.
    public static void printColor() {
        int value = 50; // Пример значения
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4.
    public static void compareNumbers() {
        int a = 10; // Пример значения
        int b = 20; // Пример значения
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5.
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6.
    public static void checkPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    // 7.
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8.
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9.
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10.
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 11.
    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 12.
    public static void multiplyLessThanSix() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // 13.
    public static void fillDiagonalArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
        }
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // 14.
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
