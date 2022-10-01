package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

public class Palm extends Växter {
    double dosering = 0.5 * getLängd();

    public double getDosering() {
        return dosering;
    }

    public String getNäring() { // Typ av näring
        return "Kranvatten";
    }

    public Palm(double längd, String namn) {
        super(längd, namn);
    }


}

