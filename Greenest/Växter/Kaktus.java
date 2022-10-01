package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

public class Kaktus extends Växter {

    double dosering = 0.02; //(liter)

    public double getDosering() {
        return dosering;
    }
    public String getNäring() { // Typ av näring
        return "Mineralvatten";
    }
    public Kaktus(double längd, String namn) {
        super(längd, namn);
    }

        }
