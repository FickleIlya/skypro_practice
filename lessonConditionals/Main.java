package lessonConditionals;

public class Main {
    public static void main(String[] args) {
    task4(24);
    }

    public static void task1(int clientOS) {
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2(int clientOS, int clientDeviceYear) {

        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3(int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4(int deliveryDistance) {
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

    public static void task5(int monthNumber) {
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц принадлежит сезону зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит сезону весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит сезону лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит сезону осень!");
                break;
            default:
                System.out.println("Такого месяца нет");
                break;

        }
    }
}
