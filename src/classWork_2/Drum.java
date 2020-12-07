package classWork_2;

public class Drum implements Instrument {
    private String Size;

    public Drum(String size) {
        Size = size;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    @Override
    public void play() {
        System.out.println("It`s plays a drum, size-" + getSize());
    }
}
