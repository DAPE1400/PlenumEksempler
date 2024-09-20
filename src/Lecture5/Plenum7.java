package Lecture5;

import static javax.swing.JOptionPane.*;

class Bok{
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok(String tittel, String forfatter, double pris ){
        this.tittel = tittel;
        this.forfatter = forfatter;
        if(pris > 0){  // NB: Må være med her også!
            this.pris = pris;
        }
    }

    public String getTittel(){
        return tittel;
    }

    public void setTittel(String tittel){
        this.tittel = tittel;
    }

    public String getForfatter(){
        return forfatter;
    }

    public void setForfatter(String forfatter){
        this.forfatter = forfatter;
    }

    public double getPris(){
        return pris;
    }

    public void setPris(double pris){
        if(pris > 0){
            this.pris = pris;
        }
    }

    public double regnUtRabatt(double prosent){
        double rabatt = pris*(prosent/100);
        return rabatt;
    }

    public String formaterUt(){
        String ut = "Her er bokinformasjonen : \n"+
                    "Tittel :  "+tittel+"\n" +
                    "Forfatter :"+forfatter+"\n"+
                    "Pris :"+pris+"\n";
        return ut;
    }
}

public class Plenum7 {

    public static void main(String[] args) {
       String tittel = showInputDialog("Skriv inn tittel");
       String forfatter = showInputDialog("Skriv inn forfatter");
       String innPris = showInputDialog("Skriv inn prisen");
       double pris = Double.parseDouble(innPris);

       String person = showInputDialog("Ansatt eller student (A eller S)?");

       Bok bok1 = new Bok(tittel, forfatter, pris);
       if(person.equals("A")){
           double rabatt = bok1.regnUtRabatt(15);
           double nyPris = bok1.getPris()-rabatt;
           bok1.setPris(nyPris);
       }
       String ut = bok1.formaterUt();
       showMessageDialog(null, ut);
    }
}