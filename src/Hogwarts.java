public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Имя студента - " + name + ". Сила магии - " + magicPower + ". " +
                "Расстояние трансгрессии - " + transgressionDistance;
    }

    public void compareStudents(Hogwarts hogwarts) {
        int sum1 = this.getMagicPower() + this.getTransgressionDistance();
        int sum2 = hogwarts.getMagicPower() + hogwarts.getTransgressionDistance();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " обладает бОльшей мощностью магии, чем " + hogwarts.getName());
        } else {
            System.out.println(hogwarts.getName() + " обладает бОльшей мощностью магии, чем " + this.getName());
        }
    }

    public static void printStudent(Hogwarts student) {
        System.out.println(student.toString());
    }
}
