package lesson7.HT7;

public class Cat {
    private String name;
    private int IndicatorGoloda;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.IndicatorGoloda = appetite;
    }

    public int getAppetite() {
        return IndicatorGoloda;
    }

    public String getName() {
        return name;
    }

    public void eat (Tarelochka plate){
        if (plate.isEnoughFood(this )) {
            plate.decreaseFood(IndicatorGoloda);
            satiety = true;
        }else System.out.println("There is not enough food for " + getName());
    }

    public void satietyInfo(){
        if (satiety) {
            System.out.println(getName() + " says: I'm full");
        }else System.out.println(getName() + " says: I,m still hungry, add some food in the plate");
    }
}