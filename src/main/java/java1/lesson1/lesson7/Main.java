package lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(50);


        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 5, false);
        cat[1] = new Cat("Luchik", 4, false);
        cat[2] = new Cat("Bosik", 6, false);
        cat[3] = new Cat("Wool", 7, false);
        cat[4] = new Cat("Sun", 3, false);
        for (Cat cat1 : cat) {
            while (plate.getFood() >= 0){
                cat1.eat (plate);
                cat1.setSatiety(true);
                cat1.isSatiety();

                break;
            }
            System.out.println(plate);

        }}


    }
