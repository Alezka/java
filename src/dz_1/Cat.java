package dz_1;

public class Cat extends Animal {
    String favouriteFood ="fish";

    public Cat(String name, int age, String color, double weight, String food, String location, String favouriteFood) {
        super(name, age, color, weight, food, location);
        this.favouriteFood = favouriteFood;
    }

    @Override
    String makeNoise() {
        return super.makeNoise();
    }

    @Override
    String eat() {
        return super.eat();
    }
}
