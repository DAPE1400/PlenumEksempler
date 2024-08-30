package Lecture2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
// hvilke ulike former kan input ha?
// alle muligheter fra å skrive alt i kallet
// til javax.swing.JOptionPane.* og de enkelte som over.

public class Plenum3 {
    public static void main(String[] args) {
        int alderPer = 23;
        int alderLine, sumAlder;
        alderLine = 22;
        sumAlder = alderPer+alderLine;
        System.out.println("Summen av alderen til Per og Line er "+sumAlder);
        // Med input og output bokser
        String innNavn = showInputDialog("Skriv inn navnet");
        String innAlder = showInputDialog("Skriv inn alderen");
        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2018-alder;
        showMessageDialog(null, innNavn+" er født "+fødselsår);
        // desimaltall
        String innString1 = showInputDialog("Skriv inn et desimaltall:"); // kan også sette inn et heltall!
        String innString2 = showInputDialog("Skriv inn et desimaltall til:");
        double innTall1 = Double.parseDouble(innString1);
        double innTall2 = Double.parseDouble(innString2);
        double divisjon = innTall1 / innTall2;
        showMessageDialog(null, innTall1+" delt på "+innTall2+" blir "+divisjon);
        // hva skjer dersom vi skriver inn et desimal tall for alderen?
        // hva skjer dersom vi skriver inn tekst isteden for desimaltall?
        // hva skjer dersom vi setter 0 i nevneren i divisjonen?

        // heltallsdivisjon
        String innString3 = showInputDialog("Skriv inn et heltall:");
        String innString4 = showInputDialog("Skriv inn et heltall til:");
        int innTall3 = Integer.parseInt(innString3);
        int innTall4 = Integer.parseInt(innString4);
        int divisjon1 = innTall3 / innTall4;
        showMessageDialog(null, innTall3+" delt på "+innTall4+" blir "+divisjon1);
        // hva skjer dersom vi setter 0 i nevneren i heltalls-divisjonen?

        // kode for å unngå feil i innlesning / konvertering til tall
        double tall;
        String innStreng = showInputDialog("Skriv inn et tall:");
        try{
           tall = Double.parseDouble(innStreng);
        }
        catch(Exception e){
           tall = 0;
        }
        showMessageDialog(null, "Tallet er nå "+tall);
    }
}