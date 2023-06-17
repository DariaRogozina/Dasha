package lesson6;

public abstract class Animal {
    String name;
    public Animal() {
    }

      public Animal(String name) {
        this.name = name;
    }
    public void  run() {
            }
    public void swim() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
