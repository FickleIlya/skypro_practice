package Core.lessonOOP2;

public class Bicycle extends Transport{
    @Override
    protected void checkEngine() {
        System.out.println("No engine");
    }

    @Override
    protected void checkTrailer() {
        System.out.println("No trailer");
    }
}
