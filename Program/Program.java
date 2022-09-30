package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Kaktus;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.KöttätandeVäxt;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Palm;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Växter;

import java.util.ArrayList;
import java.util.List;

public class Program {

protected List<Växter> testlist = new ArrayList<>();

public Program() {
    testlist.add(new Kaktus(50,"Uggla"));
    testlist.add(new KöttätandeVäxt(4,"Bacon"));
    testlist.add(new Palm(9,"Coco"));




}


}
