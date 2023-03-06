public class Cat {

    private String name;
    private int appetite;
    private volatile int satiety = 0;

    public Cat(String name) {
        this(name, 10);

    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        int tempAppetite = appetite;
        if (satiety < 0) appetite *= 2;
        boolean ableToEat = plate.decreaseFood(appetite);
        if (satiety <= 0 && ableToEat) {
            satiety += appetite;
            appetite = tempAppetite;
            Thread backgroundSatietyManagement = new Thread(() -> {
                while (true) {
                    satiety--;
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            backgroundSatietyManagement.setDaemon(true);
            backgroundSatietyManagement.start();
        }
    }


    public void makeALittleBitHungry() {
    }

    @Override
    public String toString() {
        return name + "{appetite=" + appetite + ", satiety=" + satiety + "}";
    }
}