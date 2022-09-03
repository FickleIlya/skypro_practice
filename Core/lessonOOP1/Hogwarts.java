package Core.lessonOOP1;

public abstract class Hogwarts {
    private int magicValue;
    private int transgressionLength;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicValue() {
        return magicValue;
    }

    public void setMagicValue(int magicValue) {
        this.magicValue = magicValue;
    }

    public int getTransgressionLength() {
        return transgressionLength;
    }

    public void setTransgressionLength(int transgressionLength) {
        this.transgressionLength = transgressionLength;
    }


}
