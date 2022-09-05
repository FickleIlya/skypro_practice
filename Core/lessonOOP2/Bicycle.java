package Core.lessonOOP2;

public class Bicycle extends Transport implements Tyres{
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
