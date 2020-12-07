package dz_2;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Tesla",229,150);
        Book book2 = new Book("HarryPoter",349,250);
        Book book3 = new Book("Ekonomica",146,140);

        Magazine magazine1 = new Magazine("EuroNews",12,30);
        Magazine magazine2 = new Magazine("UkrNews",20,17);

        Printable[]printables=new Printable[]{book1,book2,book3,magazine1,magazine2};
        for (Printable printable : printables) {
            printable.print();
        }
        Magazine.PrintMagazine(printables);
        Book.PrintBook(printables);
    }
}
