package hw7;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[]{

                new Cat("Barsik", 10),
                new Cat("Murzik", 15),
                new Cat("Dohlik", 5),
                new Cat("Zhopka", 20)

        };
        Plate plate = new Plate(34);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
    }


}

