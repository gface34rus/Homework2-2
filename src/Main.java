public class Main {
    public static void printStudent(Hogwarts student) {
        System.out.println(student.toString());
    }

    public static void compareStudentsGryffindor(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        int sum1 = gryffindor1.getNobility() + gryffindor1.getHonor() + gryffindor1.getBravery();
        int sum2 = gryffindor2.getNobility() + gryffindor2.getHonor() + gryffindor2.getBravery();
        if (sum1 > sum2) {
            System.out.println(gryffindor1.getName() + " лучший Гриффиндорец, чем " + gryffindor2.getName());
        } else {
            System.out.println(gryffindor2.getName() + " лучший Гриффиндорец, чем " + gryffindor1.getName());
        }
    }

    public static void compareStudentsHufflepuff(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        int sum1 = hufflepuff1.getHardWork() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
        int sum2 = hufflepuff2.getHardWork() + hufflepuff2.getLoyalty() + hufflepuff2.getHonesty();
        if (sum1 > sum2) {
            System.out.println(hufflepuff1.getName() + " лучший Пуффендуец, чем " + hufflepuff2.getName());
        } else {
            System.out.println(hufflepuff2.getName() + " лучший Пуффендуец, чем " + hufflepuff1.getName());
        }
    }

    public static void compareStudentsSlytherin(Slytherin slytherin1, Slytherin slytherin2) {
        int sum1 = slytherin1.getCunning() + slytherin1.getAmbition() + slytherin1.getResourcefulness() + slytherin1.getLustForPower();
        int sum2 = slytherin2.getCunning() + slytherin2.getAmbition() + slytherin2.getResourcefulness() + slytherin2.getLustForPower();
        if (sum1 > sum2) {
            System.out.println(slytherin1.getName() + " лучший Слизеринец, чем " + slytherin2.getName());
        } else {
            System.out.println(slytherin2.getName() + " лучший Слизеринец, чем " + slytherin1.getName());
        }
    }

    public static void compareStudentsRavenclaw(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        int sum1 = ravenclaw1.getMind() + ravenclaw1.getWisdom() + ravenclaw1.getWit() + ravenclaw1.getCreation();
        int sum2 = ravenclaw2.getMind() + ravenclaw2.getWisdom() + ravenclaw2.getWit() + ravenclaw2.getCreation();
        if (sum1 > sum2) {
            System.out.println(ravenclaw1.getName() + " лучший Когтевранец, чем " + ravenclaw2.getName());
        } else {
            System.out.println(ravenclaw2.getName() + " лучший Когтевранец, чем " + ravenclaw1.getName());
        }
    }

    public static void compareStudents(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        int sum1 = hogwarts1.getMagicPower() + hogwarts1.getTransgressionDistance();
        int sum2 = hogwarts2.getMagicPower() + hogwarts2.getTransgressionDistance();
        if (sum1 > sum2) {
            System.out.println(hogwarts1.getName() + " обладает бОльшей мощностью магии, чем " + hogwarts2.getName());
        } else {
            System.out.println(hogwarts2.getName() + " обладает бОльшей мощностью магии, чем " + hogwarts1.getName());
        }
    }

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
        printStudent(gryffindor2);
        printStudent(ravenclaw1);
        printStudent(hufflepuff1);
        printStudent(slytherin1);
        compareStudentsGryffindor(gryffindor1, gryffindor2);
        compareStudentsHufflepuff(hufflepuff1, hufflepuff2);
        compareStudentsRavenclaw(ravenclaw1, ravenclaw3);
        compareStudentsSlytherin(slytherin1, slytherin2);
        compareStudents(gryffindor1, slytherin1);
    }
}