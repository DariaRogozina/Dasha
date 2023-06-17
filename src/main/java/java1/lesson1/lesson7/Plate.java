package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int foodToDecrease){
        food -= foodToDecrease;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public String toString() {
        return "Plate[" + food + "]";

    }
}
