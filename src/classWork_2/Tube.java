package classWork_2;

public class Tube implements Instrument{
   private double diameter;

    public Tube(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("It`s plays a tube with diameter-" + getDiameter() +this.getClass().getName());
    }
}
