package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

public class KöttätandeVäxt extends Växter {

    // Köttätande växter behöver alltid en basnivå av 0,1 liter proteindryck per dag
    // och sedan ett extra tillskott med 0,2 liter proteindryck * sin längd i meter.
    double dosering = (getLängd() * 0.2) + 0.1;

    public double getDosering() {
        return dosering;
    }
    public String getNäring() { // Typ av näring
        return "Proteindryck";
    }

    public KöttätandeVäxt(double längd, String namn) {
        super(längd, namn);
    }

}
