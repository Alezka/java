package dz_1;

public class Hourse extends Animal {

    private boolean saddle = true;

    public Hourse(String name, int age, String color, double weight, String food, String location, boolean saddle) {
        super(name, age, color, weight, food, location);
        this.saddle = saddle;
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
