package Lecture7;

import javax.swing.JOptionPane;

public class KomplimentBot {
    public static void main(String[] args) {
        String følelse = "trist";
        String kompliment = "Du er fantastisk fordi du er utholdende og sterk!";
        String checkinFølelse = "Føler du deg fortsatt trist? (ja/nei)";
        String fullførtMelding =  "Så flott at du føler deg bedre!";

        while (følelse.equals("trist")) {
            JOptionPane.showMessageDialog(null, kompliment);

            String svar = JOptionPane.showInputDialog(null, checkinFølelse);

            if (svar.equals("nei")) {
                følelse = "glad";
            }
        }
        JOptionPane.showMessageDialog(null, fullførtMelding);
    }
}