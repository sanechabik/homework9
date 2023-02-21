import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма равна " + sum);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 2. начальный массив " + Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];

        for (int j : arr) {

            if (j < min) ;
            {
                min = j;
            }
            if (j > max) ;
            {
                max = j;
            }
        }

        System.out.println("Найден минимум " + min);
        System.out.println("Найден максимум " + max);
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 3");

        int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        double average = (double) sum / arr.length;

        System.out.println("Среднее значение " + average);
    }

    public static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
