package dz_3;

public class Trousers extends Clothes implements ClothesForMan, ClothersForWomen {
    public Trousers(int price, String color, Sizes sizes) {
        super(price, color, sizes);
    }

    @Override
    public void ToDressMan() {
        System.out.println("Men was dreassed in trousers");
    }

    @Override
    public void toDressWomen() {
        System.out.println("Woman was dreassed in trousers");
    }
}
