package dz_3;

public class T_shirt extends Clothes implements ClothersForWomen, ClothesForMan{


    public T_shirt(int price, String color, Sizes sizes) {
        super(price, color, sizes);
    }

    @Override
    public void toDressWomen() {
        System.out.println("Wonen was dressed in T-shirt");

    }

    @Override
    public void ToDressMan() {
        System.out.println("Men was dreassed in T-shirt");
    }
}
