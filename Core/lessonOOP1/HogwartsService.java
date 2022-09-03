package Core.lessonOOP1;

public class HogwartsService {

    public void compareTwoStudentsOneFaculty(Griffindor studentFirst, Griffindor studentSecond){
        int valueFirst = studentFirst.getBravery() + studentFirst.getNobility() + studentFirst.getHonor();
        int valueSecond = studentSecond.getBravery() + studentSecond.getNobility() + studentSecond.getHonor();

        if (valueFirst > valueSecond) {
            System.out.println(studentFirst.getName() + " лучший Гриффиндорец, чем " + studentSecond.getName());
        } else {
            System.out.println(studentSecond.getName() + " лучший Гриффиндорец, чем " + studentFirst.getName());
        }
    }

    public void compareTwoStudentsOneFaculty(Hufflepuff studentFirst, Hufflepuff studentSecond){
        int valueFirst = studentFirst.getDiligence() + studentFirst.getLoyalty() + studentFirst.getHonesty();
        int valueSecond = studentSecond.getDiligence() + studentSecond.getLoyalty() + studentSecond.getHonesty();

        if (valueFirst > valueSecond) {
            System.out.println(studentFirst.getName() + " лучший Гриффиндорец, чем " + studentSecond.getName());
        } else {
            System.out.println(studentSecond.getName() + " лучший Гриффиндорец, чем " + studentFirst.getName());
        }
    }

    public void compareTwoStudentsOneFaculty(Ravenclaw studentFirst, Ravenclaw studentSecond){
        int valueFirst = studentFirst.getCreativity() + studentFirst.getIntelligence() + studentFirst.getWisdom() + studentFirst.getWit();
        int valueSecond = studentSecond.getCreativity() + studentSecond.getIntelligence() + studentSecond.getWisdom() + studentSecond.getWit();

        if (valueFirst > valueSecond) {
            System.out.println(studentFirst.getName() + " лучший Гриффиндорец, чем " + studentSecond.getName());
        } else {
            System.out.println(studentSecond.getName() + " лучший Гриффиндорец, чем " + studentFirst.getName());
        }
    }

    public void compareTwoStudentsOneFaculty(Slytherin studentFirst, Slytherin studentSecond){
        int valueFirst = studentFirst.getAmbition() + studentFirst.getCunning() + studentFirst.getDetermination() + studentFirst.getResourcefulness() + studentFirst.getThirstForPower();
        int valueSecond = studentSecond.getAmbition() + studentSecond.getCunning() + studentSecond.getDetermination() + studentSecond.getResourcefulness() + studentSecond.getThirstForPower();

        if (valueFirst > valueSecond) {
            System.out.println(studentFirst.getName() + " лучший Гриффиндорец, чем " + studentSecond.getName());
        } else {
            System.out.println(studentSecond.getName() + " лучший Гриффиндорец, чем " + studentFirst.getName());
        }
    }

    public void compareTwoStudents(Hogwarts studentFirst, Hogwarts studentSecond){
        if (studentFirst.getMagicValue() > studentSecond.getMagicValue()) {
            System.out.println(studentFirst.getName() + " обладает бОльшей магической силой, чем " + studentSecond.getName());
        } else{
            System.out.println(studentSecond.getName() + " обладает бОльшей магической силой, чем " + studentFirst.getName());
        }

        if (studentFirst.getTransgressionLength() > studentSecond.getTransgressionLength()) {
            System.out.println(studentFirst.getName() + " обладает бОльшим расстоянием трансгрессии, чем " + studentSecond.getName());
        } else{
            System.out.println(studentSecond.getName() + " обладает бОльшим расстоянием трансгрессии, чем " + studentFirst.getName());
        }
    }

}
