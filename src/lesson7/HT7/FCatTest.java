package lesson7.HT7;

public class FCatTest {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 7);
        cats[1] = new Cat("Jenya", 12);
        cats[2] = new Cat("Victor", 30);
        Tarelochka plate1 = new Tarelochka(40);
        for (Cat cat : cats) {
            cat.eat(plate1);
            cat.satietyInfo();
        }
        plate1.addFood(9);
        plate1.info();
        cats[2].eat(plate1);
        cats[2].satietyInfo();
        plate1.info();
    }
}
