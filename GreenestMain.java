package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Kaktus;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.KöttätandeVäxt;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Palm;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Växter;


import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class GreenestMain {

    public static void main(String[] args) {


        // Skapar nya växter, varje växt har en egen klass
        Växter v1 = new Kaktus(0.2, "Igge");
        Växter v2 = new Palm(5, "Laura");
        Växter v3 = new KöttätandeVäxt(0.7, "Meatloaf");
        Växter v4 = new Palm(1, "Putte");

        // Lägger in i Arraylist
        List<Växter> plantList = Arrays.asList(v1,v2,v3,v4);

        // Skriver ut vattnings instruktioner för varje element av växter.
        for (Växter element : plantList) {
            element.vattnaMedVad();
        }

       // Dialog.dialogInputs();

    }
}
