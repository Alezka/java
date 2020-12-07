package classWork1;

public class Main {
    public static void main(String[] args) {
        Male vasya =new Male("Vasil",20,"male");
        Female Olga = new Female("Olga",22,"female");

        System.out.println(vasya.toMarrige(vasya, Olga));
    }
}
