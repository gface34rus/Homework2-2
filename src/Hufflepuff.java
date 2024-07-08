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

    public static void compareStudentsHufflepuff(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        int sum1 = hufflepuff1.getHardWork() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
        int sum2 = hufflepuff2.getHardWork() + hufflepuff2.getLoyalty() + hufflepuff2.getHonesty();
        if (sum1 > sum2) {
            System.out.println(hufflepuff1.getName() + " лучший Пуффендуец, чем " + hufflepuff2.getName());
        } else {
            System.out.println(hufflepuff2.getName() + " лучший Пуффендуец, чем " + hufflepuff1.getName());
        }
    }
}
