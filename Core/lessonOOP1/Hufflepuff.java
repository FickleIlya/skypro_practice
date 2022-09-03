package Core.lessonOOP1;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicValue, int transgressionLength, int diligence, int loyalty, int honesty) {
        setMagicValue(magicValue);
        setTransgressionLength(transgressionLength);
        setName(name);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "name = " + getName() + ", diligence = " + diligence + ", loyalty = " + loyalty + ", honesty = " + honesty + ", magicValue = " + getMagicValue() + ", transgressionLength = " + getTransgressionLength();
    }
}
