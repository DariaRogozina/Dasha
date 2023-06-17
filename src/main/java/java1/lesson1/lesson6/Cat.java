package lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void run(int distance) {
        if (distance < 0){
            distance = Math.abs(distance);}
        else if (distance>200) {
            System.out.printf("%s так далеко не бегает, его хватило только на 200 м %n", name);  }

    else
        System.out.printf("%s пробежал %s м %n", name, distance);
    }

    public void swim(int distance) {

        System.out.printf("%s не умеет плавать, %s м ему не осилить %n", name, distance);
        }
    }



