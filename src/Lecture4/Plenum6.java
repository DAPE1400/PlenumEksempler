package Lecture4;

import static javax.swing.JOptionPane.*;

class Konverter{
    public static double fraCelsius(double graderCelsius){
        double fahrenheit = graderCelsius * 9/5 + 32;
        //System.out.print(faherenheit); og void først!
        return fahrenheit;
    }
    public static double fraFharenheit(double graderFharenheit){
        double celsius = (graderFharenheit-32) * 5/9;
        return celsius;
    }
}

public class Plenum6 {
    public static void main(String[] args) {
        String valg = showInputDialog("Konverter fra C eller F ?");
        if (valg.equals("C")){
            double celsius = Double.parseDouble(showInputDialog("Skriv inn grader Celsius"));
            String ut = celsius+" grader Celsius er "+Konverter.fraCelsius(celsius)+" Fharenheit";
            showMessageDialog(null,ut);
        }
        if (valg.equals("F")){
          double fharenheit = Double.parseDouble(showInputDialog("Skriv inn grader Fahrenheit"));
            String ut = fharenheit+" grader Fharenheit er "+Konverter.fraFharenheit(fharenheit)+" Celsius";
            showMessageDialog(null,ut);
        }
    }
}