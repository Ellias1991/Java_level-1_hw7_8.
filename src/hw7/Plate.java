package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }


    public boolean decreaseFood(int amount) {///количество еды в тарелке не будет отрицательным
        if (food >= amount) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public int getFood() {
        return food;

    }

    public boolean addFood(int amount) {
        if (amount < 0) {
            return false;
        } else {
            food += amount;
        }
        return true;
    }
}
