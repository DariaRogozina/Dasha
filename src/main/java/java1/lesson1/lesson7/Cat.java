package lesson7;

public class Cat {
    private String name;
    private int appetite;
    public boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate){

        System.out.println(this + " приготовился к трапезе" );
        plate.decreaseFood(appetite);
        System.out.println(this + "съел " + appetite + " единиц еды");

    }
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
