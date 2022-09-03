package Core.lessonOOP1;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magicValue, int transgressionLength, int nobility, int honor, int bravery) {
        setMagicValue(magicValue);
        setTransgressionLength(transgressionLength);
        setName(name);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "name = " + getName() + ", nobility = " + nobility + ", honor = " + honor + ", bravery = " + bravery + ", magicValue = " + getMagicValue() + ", transgressionLength = " + getTransgressionLength();
    }
}
