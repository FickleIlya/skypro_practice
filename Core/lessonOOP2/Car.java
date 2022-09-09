package Core.lessonOOP2;

public class Car extends Transport{
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    protected void checkTrailer() {
        System.out.println("No trailer");
    }
}
