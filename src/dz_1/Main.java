package dz_1;

public class Main {

    public static void main(String[] args) {
        Veteriarian veterenar=new Veteriarian();

        Dog dog1 = new Dog(
                "Muhtar", 2, "black", 30, "meet", "Lviv", 12);
        Dog dog2 = new Dog(
                "Azar", 8, "black-white", 13, "meet", "Odessa", 2);
        Cat cat1 = new Cat(
                "Banan", 3, "grey", 4.5, "milk", "Lutsk", "fish");
        Hourse horse1 = new Hourse(
                "Yaguar", 5, "black", 186.5, "oat", "Lviv", true);
        Hourse horse2 = new Hourse(
                "Kokos", 8, "white", 212, "grass", "Lviv", true);

        Animal arrayOfAnimal[] = {dog1, dog2, cat1, horse1, horse2};

        for (Animal animal : arrayOfAnimal) {
            System.out.println(animal.name+" was in veterenar and veterenar said, that");
            veterenar.treatAnimal(animal);
            System.out.println("---------------");
        }

        System.out.println("_______");
        System.out.println(dog1.eat()+"\n"
        +dog2.getAge()+"it`s age dog2");
    }
}
