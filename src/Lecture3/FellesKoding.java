package Lecture3;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class FellesKoding {
    public static void main(String[] args) {

        String heltallBruker = showInputDialog(null, "Gi et heltall");
        String desimaltallBruker = showInputDialog(null, "Gi et desimaltall");

        int heltall = Integer.parseInt(heltallBruker);
        double desimaltall = Double.parseDouble(desimaltallBruker);

        String sporsmaal = showInputDialog(null, "Er produktet mellom disse tallene større enn 111.5 (ja|nei)");
        double produktet = heltall * desimaltall;
        String response = "";
        String brukerErKorrektResponse = "Hurra du tok rett. \n Produketet er " + produktet;
        String brukerErFeilResponse = "Sorry, du tok feil. \n Produketet er " + produktet;
        if(sporsmaal.equals("ja")){
            if(produktet < 111.5){
                response = brukerErFeilResponse;
            }else {
                response = brukerErKorrektResponse;
            }
        }else {
            if (produktet < 111.5){
                response = brukerErKorrektResponse;

            }else{
                response = brukerErFeilResponse;
            }
        }

        showMessageDialog(null, response);
    }
}
