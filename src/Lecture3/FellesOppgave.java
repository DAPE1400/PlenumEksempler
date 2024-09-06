package Lecture3;

import static javax.swing.JOptionPane.*;

public class FellesOppgave {
    public static void main(String[] args) {
        // Hente inn et heltall fra bruker
        String userIntAsString = showInputDialog("Skriv inn et heltall:");
        int userInt = Integer.parseInt(userIntAsString);

        // Hente inn et desimaltall fra bruker
        String userDoubleAsString = showInputDialog(
                "Skriv inn et desimaltall (bruk punktum):");
        double userDouble = Double.parseDouble(userDoubleAsString);

        // Spør bruker om brukeren tror produktet av tallene er større enn 111.5
        String userAnswerAsString = showInputDialog(
                "Tror du " + userInt + "*" + userDouble + " er større enn 115.5? (ja/nei)");

        // Dialogboks som viser om brukeren hadde rett, og hva produktet er.
        double product = userInt*userDouble;
        boolean correctAnswer = product > 115.5;
        boolean userAnswer = userAnswerAsString.equals("ja");
        boolean userIsRight = correctAnswer == userAnswer;
        String userIsRightText = "Du har rett! Produktet er:" + product;
        String userIsWrongText = "Beklager, du har feil! Produktet er:" + product;
        if(userIsRight){
            showMessageDialog(null, userIsRightText);
        } else{
            showMessageDialog(null, userIsWrongText);
        }

    }
}
