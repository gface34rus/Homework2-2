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
}
