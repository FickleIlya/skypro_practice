package Core.lessonOOP1;

public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Гарри Поттер", 57, 12, 43, 12, 54);
        Griffindor hermione = new Griffindor("Гермиона Грейнджер", 23, 15, 63, 12, 54);
        Griffindor ron = new Griffindor("Рон Уизли", 44, 12, 43, 82, 84);
        Griffindor[] griffindors = {harry, hermione, ron};

        Slytherin drako = new Slytherin("Драко Малфой",56, 13, 43, 12, 54, 55, 43);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 23, 12, 63, 12, 54, 55, 43);
        Slytherin gregory = new Slytherin("Грегори Гойл", 44, 12, 43, 82, 84, 55, 43);
        Slytherin[] slytherins = {drako, graham, gregory};

        Hufflepuff zachariah = new Hufflepuff("Захария Смит", 56, 12, 43, 12, 54);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 23, 12, 63, 12, 54);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 44, 12, 43, 82, 84);
        Hufflepuff[] hufflepuffs = {zachariah, cedric, justin};

        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 56, 12, 43, 12, 54, 11);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 23, 12, 63, 12, 54, 11);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 44, 12, 43, 82, 84, 11);
        Ravenclaw[] ravenclaws = {zhou, padma, marcus};

        HogwartsService hogwartsService = new HogwartsService();
        hogwartsService.compareTwoStudents(harry, drako);
        hogwartsService.compareTwoStudentsOneFaculty(harry, hermione);
    }


}
