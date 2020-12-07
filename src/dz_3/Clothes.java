package dz_3;

public abstract class Clothes {
    int price;
    String color;
    Sizes Sizes;

    public Clothes(int price, String color, Sizes sizes) {
        this.price = price;
        this.color = color;
        Sizes = sizes;
    }

    @Override
    public String toString() {
        return "{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", Sizes=" + Sizes +
                '}';
    }
}
