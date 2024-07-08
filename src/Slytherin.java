public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ". Хитрость - " + cunning +
                ". Решительность - " + determination +
                ". Амбициозность - " + ambition +
                ". Находчивость - " + resourcefulness +
                ". Жажда власти - " + lustForPower;
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
}
