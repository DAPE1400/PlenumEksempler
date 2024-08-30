package Lecture2;


import java.text.MessageFormat;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

@SuppressWarnings("SpellCheckingInspection")
public class Plenum2 {
    public static void main(String[] args) {

        // Med input og output bokser

        // Kan skrive String xxx = javax.swing.JoptionPane.showInputDialog()

        String innNavn = showInputDialog("Skriv inn navnet");
        String innAdresse = showInputDialog("Skriv inn adressen");
        String innPostNr = showInputDialog("Skriv inn postnummer");
        String innPostAdresse = showInputDialog("Skriv inn postadresse");
        showMessageDialog(null, innNavn + " har adressen " + innAdresse);

        // legg ut utskriften i flere linjer i meldingsboksen som for System.out
        String ut = "Navnet : " + innNavn + "\n" + // merk her kan vi "brekke linjen"
                "Adressen : " + innAdresse + " " + innPostNr + " " + innPostAdresse;

        showMessageDialog(null, ut);
        // merk innrykk og ha ting under hverandre!

        //scanner
//        Scanner s = new Scanner(System.in);
//        System.out.println("skriv in ditt navn:");
//        String navn = s.nextLine();
//        System.out.println("navnet ditt er: " + navn);
//
//        String output = MessageFormat.format("Navnet :  {0} \n Adressen : {1} {2} \n {3}",
//                innNavn, innAdresse, innPostNr, innPostAdresse);
//         showMessageDialog(null, output);
    }
}
