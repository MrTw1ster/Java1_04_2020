package lesson7.HT7;

public class Tarelochka {
    private int food;

    public Tarelochka(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public boolean isEnoughFood(Cat cat) {
        return cat.getAppetite() <= food;
    }

    public void addFood(int food){
        this.food += food;
    }
}
