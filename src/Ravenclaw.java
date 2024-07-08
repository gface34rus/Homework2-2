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

    public void compareStudentsRavenclaw(Ravenclaw ravenclaw) {
        int sum1 = this.getMind() + this.getWisdom() + this.getWit() + this.getCreation();
        int sum2 = ravenclaw.getMind() + ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreation();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + ravenclaw.getName());
        } else {
            System.out.println(ravenclaw.getName() + " лучший Когтевранец, чем " + this.getName());
        }
    }
}
