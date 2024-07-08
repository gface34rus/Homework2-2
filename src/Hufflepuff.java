public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Трудолюбие - " + hardWork +
                ". Верность - " + loyalty +
                ". Честность - " + honesty;
    }

    public void compareStudentsHufflepuff(Hufflepuff hufflepuff) {
        int sum1 = this.getHardWork() + this.getLoyalty() + this.getHonesty();
        int sum2 = hufflepuff.getHardWork() + hufflepuff.getLoyalty() + hufflepuff.getHonesty();
        if (sum1 > sum2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + hufflepuff.getName());
        } else {
            System.out.println(hufflepuff.getName() + " лучший Пуффендуец, чем " + this.getName());
        }
    }
}
