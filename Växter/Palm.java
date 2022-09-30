package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

public class Palm extends Växter {

    // En palm behöver 0,5 liter kranvatten per dag * sin längd i meter.
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

