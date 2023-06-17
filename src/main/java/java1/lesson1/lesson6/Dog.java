package lesson6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void run(int distance) {
        if (distance < 0){
            distance = Math.abs(distance);}
        else if (distance>500) {
            System.out.printf("%s так далеко не бегает, его хватило только на 500 м %n", name);  }

        else
            System.out.printf("%s пробежал %s м %n", name, distance);
    }
    public void swim(int distance) {
        if (distance < 0){
            distance = Math.abs(distance);}
        else if (distance>10) {
            System.out.printf("%s так далеко проплывет, его хватило только на 10 м %n", name);  }

        else
            System.out.printf("%s проплыл %s м %n", name, distance);
        }
}