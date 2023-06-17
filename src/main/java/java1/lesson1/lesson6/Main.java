package lesson6;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Шустрик");
        cat1.run(250);
        cat1.swim(0);
        dog1.run(600);
        dog1.swim(-50);
}}