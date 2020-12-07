package dz_1;

public class Animal {

    String name;
    private int  age;
    String color;
    double weight;
    private String food;
    private String location;

    public Animal(String name, int age, String color, double weight, String food, String location) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.food = food;
        this.location = location;
    }

    String makeNoise() {
        return name + " sleep";
    }

    String eat() {
        return name + " eat";
    }

    String sleep() {
        return name + " sleap";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;

    }
}
