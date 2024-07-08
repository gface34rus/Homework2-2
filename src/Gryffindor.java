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
}
