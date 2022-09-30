package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

public class Kaktus extends Växter {

    // Kaktusar: Varje kaktus ska ha 2 cl mineralvatten/dag,
    // oberoende av kaktusens storlek
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
