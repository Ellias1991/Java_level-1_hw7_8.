package hw7;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }


    public void decreaseFood(int amount) {
        if (amount < food) {
            food -= food;
        } else {
            food = 0;

        }

    }

    public void addFood() {
        food += food;
    }


    public void info() {
        System.out.println("plate " + food);
    }

}

