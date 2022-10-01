package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Kaktus;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.KöttätandeVäxt;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Palm;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Växter;

import java.util.Arrays;
import java.util.List;

public class Program {

    public static void växtProgram() {

        // Här är ett exempel på polymorfism (Objekt växt som är något annat också.)
        Växter v1 = new Kaktus(0.2, "Igge");
        Växter v2 = new Palm(5, "Laura");
        Växter v3 = new KöttätandeVäxt(0.7, "Meatloaf");
        Växter v4 = new Palm(1, "Putte");

        // Lägger in i Arraylist
        List<Växter> plantList = Arrays.asList(v1, v2, v3, v4);

        boolean run = true; // Loop startas medan run = true
        while (run) {
            var waterThisPlant = Message.waterWhatPlant();
            if (waterThisPlant == null) {
                Message.exitMessage();
                break;
            }


            boolean hittat = false;
            for (Växter element : plantList) { // Om waterWhatPlant innehåller ett namn som finns i arraylist, returnera vattnaMedVad.
                if (element.getNamn().toLowerCase().equals(waterThisPlant)) {
                    element.vattnaMedVad();
                    hittat = true;

                    // kan vi koda in i message?
                    if (Message.tryAgain() != 0) { // Om användare trycker avbryt eller cancel, avbryts programmet.
                        Message.exitMessage();
                        run=false; // Bryter while loop och låter program avslutas
                    }
                }


            }

            if (!hittat) { // Om namnet inte hittas bland växter får användare chans att försöka igen eller avbryta.
                Message.nameNotFound();
                // kan vi koda in i message?
                if (Message.tryAgain() != 0) { // Om användare trycker avbryt eller cancel, avbryts programmet.
                    Message.exitMessage();
                    run=false; // Bryter while loop och låter program avslutas
                }
            }


        }
    }


}
