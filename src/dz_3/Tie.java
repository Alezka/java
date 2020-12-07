package dz_3;

public class Tie extends Clothes implements ClothesForMan {

    public Tie(int price, String color, Sizes sizes) {
        super(price, color, sizes);
    }

    @Override
    public void ToDressMan() {
        System.out.println("Men was dreassed in tie");
    }
}
