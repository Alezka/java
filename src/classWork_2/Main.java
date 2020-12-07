package classWork_2;

public class Main {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(7);
        Guitar guitar2 = new Guitar(6);
        Guitar guitar3 = new Guitar(4);

        Tube tube1 = new Tube(4.3);
        Tube tube2 = new Tube(7.2);
        Tube tube3 = new Tube(9.6);

        Drum drum1 = new Drum("Small");
        Drum drum2 = new Drum("Medium");
        Drum drum3 = new Drum("Big");

        Instrument[] instruments = new Instrument[]{guitar1, guitar2, guitar3, tube1, tube2, tube3, drum1, drum2, drum3};
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
