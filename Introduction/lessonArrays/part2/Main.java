package Introduction.lessonArrays.part2;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
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

    public static void task1()  {
        int[] randomArray = generateRandomArray();
        int sumPerMonth = 0;

        for (int daySum : randomArray) {
            sumPerMonth += daySum;
        }
        System.out.println("Сумма трат за месяц составила " + sumPerMonth + " рублей");
    }

    public static void task2() {
        int[] randomArray = generateRandomArray();
        int minDaySum = randomArray[0];
        int maxDaySum = randomArray[0];

        for (int daySum : randomArray) {
            if (daySum < minDaySum) {
                minDaySum = daySum;
            }
            if (daySum > maxDaySum){
                maxDaySum = daySum;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDaySum + " рублей. " +
                "Максимальная сумма трат за день составила " + maxDaySum + " рублей");
    }

    public static void task3() {
        int[] randomArray = generateRandomArray();
        int sumPerMonth = 0;

        for (int daySum : randomArray) {
            sumPerMonth += daySum;
        }
        var averageValue = sumPerMonth / randomArray.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
