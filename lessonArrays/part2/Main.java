package lessonArrays.part2;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray();
        task4();
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(int[] array)  {
        int sumPerMonth = 0;

        for (int j : array) {
            sumPerMonth += j;
        }
        System.out.println("Сумма трат за месяц составила " + sumPerMonth + " рублей");
    }

    public static void task2(int[] array) {
        Arrays.sort(array);

        System.out.println("Минимальная сумма трат за день составила " + array[0] + " рублей. " +
                "Максимальная сумма трат за день составила " + array[array.length - 1] + " рублей");
    }

    public static void task3(int[] array) {
        int sumPerMonth = 0;

        for (int j : array) {
            sumPerMonth += j;
        }

        var averageValue = sumPerMonth / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char currentLetter;
        char letterToSwap;

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            currentLetter = reverseFullName[i];
            letterToSwap = reverseFullName[reverseFullName.length - 1 - i];

            reverseFullName[reverseFullName.length - 1 - i] = currentLetter;
            reverseFullName[i] = letterToSwap;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}
