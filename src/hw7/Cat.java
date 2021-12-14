package hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;//значение по умолчанию--false

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;

    }


    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }

    public boolean eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            System.out.println("Cat " + name + "  покушал");
            satiety = true;
            return true;
        } else {
            System.out.println("Cat " + name + " не покушал");
            return false;
        }


    }
}