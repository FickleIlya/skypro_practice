package Introduction.lessonStrings;

public class Main {
    public static void main(String[] args) {
        task3("Иванов Семён Семёнович");
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2(String fullName) {
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    public static void task3(String fullName) {
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);

        // second option
        
//        String[] arr = fullName.split(" ");
//        System.out.print("Данные ФИО сотрудника — ");
//        for (String name: arr){
//            if (name.contains("ё")){
//                name = name.replace('ё', 'е');
//            }
//            System.out.print(name + " ");
//        }
    }
}
