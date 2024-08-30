package Lecture2;
import java.util.Scanner;
public class Plenum1 {
    public static void main(String[] args) {
        String navn, adresse;
        navn = "Per Hansen";
        adresse = "Osloveien 82";
        String postAdresse = "Oslo";
        String postNr = "0234";
        System.out.println("Navnet er : "+navn);
        System.out.print("Adressen er : ");
        System.out.println(adresse+" "+postNr+" "+postAdresse);
        // Bruk debug for å se variablene blir opprettet

        // Kommenter ut med /* */ hele over for å vise bare meldingsbokser

        // Overskirv noen variabler for å see i debuggeren at de endrer seg
//        navn = "Kong Harald";
//        adresse = "Slottsplassen 1";
//        postAdresse = "Oslo";
//        postNr = "0010";
//        System.out.println("Navnet er : "+navn);
//        System.out.print("Adressen er : ");
//        System.out.println(adresse+" "+postNr+" "+postAdresse);
    }
}