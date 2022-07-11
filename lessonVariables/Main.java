package lessonVariables;

public class Main {
    public static void main(String[] args) {
        taskFifth();
    }

    public static void taskFirst() {
        byte first = 127;
        short second = 32767;
        int third = 2147483647;
        long fourth = 123456789L;

        float fifth = 3.47f;
        double sixth = 3.7;

        char c = 'C';
        boolean bool = true;
    }

    public static void taskSecond() {

        float weightFirstSportsman = 78.2f;
        float weightSecondSportsman = 82.7f;

        float sumWeight = weightFirstSportsman + weightSecondSportsman;
        System.out.println("Summary weight: " + sumWeight);

        float diffWeight = weightSecondSportsman - weightFirstSportsman;
        System.out.println("Difference between weights: " + diffWeight);
    }
    public static void taskThird() {

        int bananas = 80*5;
        int milk = 105*2;
        int iceCream = 100*2;
        int eggs = 70*4;

        int total = bananas + milk + iceCream + eggs;
        System.out.println("Grams: " + total);

        float totalKilogram= (float) total/100;
        System.out.println("Kilograms: " + totalKilogram);
    }

    public static void taskFourth() {

        var remains = 7;
        float firstCase = 0.25f;
        float secondCase = 0.5f;

        var daysInFirstCase = remains/firstCase;
        var daysInSecondCase = remains/secondCase;
        var daysOnAverage = (daysInFirstCase + daysInSecondCase)/2;

        System.out.println("Days in first case (250g): " + daysInFirstCase);
        System.out.println("Days in second case (500g): " + daysInSecondCase);
        System.out.println("Days on average: " + daysOnAverage);

    }

    public static void taskFifth() {

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        float newSalaryMasha = (float) (salaryMasha * 1.1);
        float newSalaryDenis = (float) (salaryDenis * 1.1);
        float newSalaryKristina = (float) (salaryKristina * 1.1);

        float diffSalaryMasha = newSalaryMasha*12 - salaryMasha*12;
        float diffSalaryDenis = newSalaryDenis*12 - salaryDenis*12;
        float diffSalaryKristina = newSalaryKristina*12 - salaryKristina*12;

        System.out.println("Masha's salary now is " + newSalaryMasha + " rubles." +
                " And annual income increased by " + diffSalaryMasha + " rubles.");
        
        System.out.println("Denis's salary now is " + newSalaryDenis + " rubles." +
                " And annual income increased by " + diffSalaryDenis + " rubles.");

        System.out.println("Kristina's salary now is " + newSalaryKristina + " rubles." +
                " And annual income increased by " + diffSalaryKristina + " rubles.");

    }
}
