public class Main {
    public static void main(String[] args) {
        Gryffindor gryffindor1 = new Gryffindor("Гарри Поттер", 95, 95, 95, 98, 99);
        Gryffindor gryffindor2 = new Gryffindor("Рон Уизли", 80, 90, 75, 80, 50);
        Gryffindor gryffindor3 = new Gryffindor("Гермиона Грейнджер", 90, 95, 87, 85, 50);

        Slytherin slytherin1 = new Slytherin("Драко Малфой", 90, 90, 98, 94, 99, 93, 99);
        Slytherin slytherin2 = new Slytherin("Грегори Гойл", 59, 10, 28, 74, 65, 15, 24);
        Slytherin slytherin3 = new Slytherin("Грэхэм Монтегю", 60, 70, 28, 54, 69, 73, 49);

        Hufflepuff hufflepuff1 = new Hufflepuff("Захария Смит", 75, 75, 75, 75, 75);
        Hufflepuff hufflepuff2 = new Hufflepuff("Седрик Диггори", 29, 58, 65, 45, 95);
        Hufflepuff hufflepuff3 = new Hufflepuff("Джастин Финч-Флетчли", 7, 5, 79, 79, 79);

        Ravenclaw ravenclaw1 = new Ravenclaw("Чжоу Чанг", 55, 55, 55, 55, 55, 55);
        Ravenclaw ravenclaw2 = new Ravenclaw("Падма Патил", 35, 45, 55, 65, 75, 85);
        Ravenclaw ravenclaw3 = new Ravenclaw("Маркус Белби", 46, 55, 24, 88, 23, 8);

        Hogwarts.printStudent(gryffindor2);
        Hogwarts.printStudent(ravenclaw1);
        Hogwarts.printStudent(hufflepuff1);
        Hogwarts.printStudent(slytherin1);

        gryffindor1.compareStudentsGryffindor(gryffindor2);
        hufflepuff1.compareStudentsHufflepuff(hufflepuff2);
        ravenclaw1.compareStudentsRavenclaw(ravenclaw3);
        slytherin1.compareStudentsSlytherin(slytherin2);
        slytherin1.compareStudents(gryffindor1);
    }
}