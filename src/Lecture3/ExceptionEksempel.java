package Lecture3;

import static javax.swing.JOptionPane.showInputDialog;
// kommenter ut try catch for å se hva some skjer hvis man ikke håndterer feil
// vis hva some skjer hvis man ikke assigner tall = 0
// vis at man kunne egentlig ha satt tall = 0 som default i dette eksempelet.
// snakk om kommando jeg bruker ctrl + numpad /
// ctrl + a ... ctrl + alt + i
// Intellij commands cheat sheet?
public class ExceptionEksempel {
    public static void main(String[] args) {
        double tall;
        String innStreng = showInputDialog("skriv inn et tall");

        try{
            tall = Double.parseDouble(innStreng);
        }
        catch(Exception e){
            tall = 0;
        }
        System.out.println(tall * 2);
    }
}
