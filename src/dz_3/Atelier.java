package dz_3;

public abstract class Atelier {

    public static void main(String[] args) {
        Dress dress1 = new Dress(2000, "black", Sizes.XXS);
        Dress dress2 = new Dress(1500, "red", Sizes.XXS);
        T_shirt t_shirt1 = new T_shirt(400, "grey", dz_3.Sizes.L);
        Tie tie1 = new Tie(150, "black", Sizes.S);

        Clothes[] allclothes = new Clothes[]{dress1, dress2, t_shirt1, tie1};
        choiceOfMan( allclothes);
    }


    static void choiceOfMan(Clothes[] allclothes) {
        for (Clothes clothes : allclothes) {
            if (clothes instanceof ClothesForMan) {
                System.out.println(clothes.toString());
            }
        }
    }

    static void choiceOfWomen(Clothes[] allclothes) {
        for (Clothes clothes : allclothes) {
            if (clothes instanceof ClothersForWomen) {
                System.out.println(clothes.toString());
            }
        }
    }

}

