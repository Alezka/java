package dz_3;

public class Dress extends Clothes implements ClothersForWomen {

    public Dress(int price, String color, Sizes sizes) {
        super(price, color, sizes);
    }

    @Override
    public void toDressWomen() {
        System.out.println("Women was dressed in dress");
    }
}
