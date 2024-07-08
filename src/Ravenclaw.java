public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
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

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                ". Ум - " + mind +
                ". Мудрость - " + wisdom +
                ". Остроумие - " + wit +
                ". Творчество - " + creation;
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
}
