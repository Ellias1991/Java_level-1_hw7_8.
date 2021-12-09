package hw7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public boolean isFull(int satiety) {
        if (satiety == appetite) {
            return true;
        } else {
            return false;
        }
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        if (appetite == satiety) {
            System.out.println("Cat " + name + " eat");
        } else {
            System.out.println("Cat " + name + " didn't eat");
        }

    }
}