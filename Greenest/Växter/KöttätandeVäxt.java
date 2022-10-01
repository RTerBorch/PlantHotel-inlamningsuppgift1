package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

public class KöttätandeVäxt extends Växter {

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
