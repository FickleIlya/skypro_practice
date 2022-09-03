package Core.lessonOOP1;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicValue, int transgressionLength, int intelligence, int wisdom, int wit, int creativity) {
        setMagicValue(magicValue);
        setTransgressionLength(transgressionLength);
        setName(name);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "name = " + getName() + ", intelligence = " + intelligence + ", wisdom = " + wisdom + ", wit = " + wit + ", creativity = " + creativity + ", magicValue = " + getMagicValue() + ", transgressionLength = " + getTransgressionLength();
    }
}
