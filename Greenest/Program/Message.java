package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program;

import javax.swing.*;

public interface Message {

    void vattnaMedVad();

    static String waterWhatPlant() {
        var waterWhatPlant = JOptionPane.showInputDialog(null, "Vilken växt vill du vattna? ");
        if (waterWhatPlant != null) {
            waterWhatPlant = waterWhatPlant.trim(); // Tar bort eventuella mellanlag.
        }
        return waterWhatPlant;
    }

    static void exitMessage() {
        JOptionPane.showMessageDialog(null, "Avslutar programmet.");
    }

    static void nameNotFound() {
        JOptionPane.showMessageDialog(null, "Namnet du angav hittades inte i listan.");
    }

    static int tryAgain(){
        return JOptionPane.showConfirmDialog(null,
                "Vill du försöka igen?");
    }


}
