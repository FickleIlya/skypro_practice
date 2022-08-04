package lessonMethods;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    }

    public static void task1(int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2(int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3(int deliveryDistance) {
            int deliveryTime = 1;

            if (deliveryDistance < 20){
                System.out.println("Потребуется дней: " + deliveryTime);
            }else if(deliveryDistance < 60){
                deliveryTime += 1;
                System.out.println("Потребуется дней: " + deliveryTime);
            }else if (deliveryDistance <= 100){
                deliveryTime += 2;
                System.out.println("Потребуется дней: " + deliveryTime);
            }
        }

}
