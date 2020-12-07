package dz_2;

public class Magazine implements Printable {
    private String title;
    private int pages;
    private int price;

    public Magazine(String title, int pages, int price) {
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    static void  PrintMagazine(Printable[] printables){
        for (Printable printable : printables) {
          if( printable instanceof Magazine){
              System.out.println(printable.toString());
          }
        }
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }

    @Override
    public void print() {
        System.out.println(getTitle());
    }
}
