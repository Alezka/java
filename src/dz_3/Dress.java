package dz_3;

public class Dress extends Clothes implements ClothersForWomen {

    Dress dress1= new Dress(2000,"black",Sizes.XXS);
    Dress dress2 = new Dress(1500,"red",Sizes.XXS);

    public Dress(int price, String color, Sizes sizes) {
        super(price, color, sizes);
    }

    @Override
    public void toDressWomen() {
        System.out.println("Women was dressed in dress");
    }
}
