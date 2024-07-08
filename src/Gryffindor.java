public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

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

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void printStudents(Gryffindor gryffindor) {
        System.out.println("Имя студента - " + gryffindor.getName() + ". Сила магии - " + gryffindor.getMagicPower() + ". " +
                "Расстояние трансгрессии - " + gryffindor.getTransgressionDistance() + ". Благородство - "
                + gryffindor.getNobility() + ". Честь - " + gryffindor.getHonor() + ". Храбрость - " + gryffindor.getBravery());
    }

    @Override
    public String toString() {
        return super.toString() +
                ". Благородство - " + nobility +
                ". Честь - " + honor +
                ". Храбрость - " + bravery;
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
}
