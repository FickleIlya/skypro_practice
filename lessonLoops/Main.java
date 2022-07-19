package lessonLoops;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task1(){
        int num = 0;

        while (num < 10){
            num += 1;
            System.out.print(num + " ");
        }

        System.out.println();

        for (; num >= 1; num--){
            System.out.print(num + " ");
        }

    }

    public static void task2(int firstFriday){

        int friday = firstFriday;
        while (friday < 31){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
    }

    public static void task3(){
        int currentYear = LocalDate.now().getYear();

        for (int year = currentYear - 200; year <= currentYear + 100; year++){
            if (year % 79 == 0){
                System.out.println(year);
            }
        }
    }
}
