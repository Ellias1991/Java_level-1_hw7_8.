package hw7;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[]{

                new Cat("Barsik",10,0),
                new Cat("Murzik",15,0),
                new Cat("Dohlik",5,0),
                new Cat("Zhopka",20,0)

        };
        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

    }


}

