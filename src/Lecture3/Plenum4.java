package Lecture3;

import javax.swing.*;

import static javax.swing.JOptionPane.*;
public class Plenum4{
    public static void main(String[] args) {
        // kjør i debug for å se på variabler
        int tall1 = 2;
        int tall2 = 4;
        int sum = tall1 + tall2;
        int subtraksjon = tall1 - tall2;
        int multiplikasjon = tall1 * tall2;
        int divisjon = tall1 / tall2;
        int resultat = tall1*tall2-tall1+(tall1+tall2)/tall1;
        System.out.print(resultat);

        // prøv 4 /3 og se forskjell i resultatet (antall desimaler og nøyaktighet
        int tall3 = 40_000;
        double tall4 = 3;
        double divisjon1 = tall3/tall4;
        System.out.println(divisjon1);
        // modulus
        // dele epler
        String innEpler = showInputDialog("Et antall epler skal deles på et anntall personer\nSkriv antall epler:");
        String innPersoner = showInputDialog("som skal deles på antall personer:");
        int antallEpler = Integer.parseInt(innEpler);
        int antallPersoner = Integer.parseInt(innPersoner);
        double antallEplerPerPerson = antallEpler / antallPersoner; // heltallsdivisjon
        double antallPersonerDesimal = Double.parseDouble(innPersoner);
        double antallEplerPerPersonDesimal = antallEpler / antallPersonerDesimal;
        showMessageDialog(null, "Antall epler pr person : "+antallEplerPerPerson);
        showMessageDialog(null, "Antall epler pr person : "+antallEplerPerPersonDesimal);
        // finne resten av eplene (modulus)
        int antallIRest = antallEpler % antallPersoner;
        showMessageDialog(null, "Antall epler igjen : "+antallIRest);

        // casting
        int tall5=23;
        int tall6=3;
        double tall7=(double)tall5;
        double tall8=23.6;
        int tall9=(int)tall8;
        double divisjon2 = (double)tall5/(double)tall6;
        double divisjon3 = tall5 / (double)tall6;

        if(tall5==tall6){
            System.out.println("Tallene er like");
        }
        if(tall5!=tall6){
            System.out.println("Tallene er ikke like");
        }
        if(tall5 > tall6){
            System.out.println("Første tallet er større enn andre");
        }

        if(tall5 < tall6){
            System.out.println("Første tallet er mindre enn andre");
        }

        if(tall5 >= tall6){
            System.out.println("Første tallet er større eller lik det andre");
        }

        if(tall5 <= tall6){
            System.out.println("Første tallet er mindre eller lik det andre");
        }
    }

}
