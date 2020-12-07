package dz_1;

public class Dog extends Animal {

    int numberOfCommand;

    public Dog(String name, int age, String color, double weight, String food, String location, int numberOfCommand) {
        super(name, age, color, weight, food, location);
        this.numberOfCommand = numberOfCommand;
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
