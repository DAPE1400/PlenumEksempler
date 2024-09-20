package Lecture5;

class Båt {
    private String navn = "Boat";
    private boolean isbryter;

    public Båt(String navn, boolean isBryter){
        this.navn = navn;
        this.isbryter = isBryter;
    }

    public String getNavn() {
        return this.navn;
    }

    public void setNavn(String navn) {
        if(validerNavn(navn)){
            this.navn = navn;
        }
    }

    private boolean validerNavn(String navn){
        return navn != null && !navn.trim().isEmpty();
    }

    public boolean isIsbryter() {
        return isbryter;
    }

    public void setIsbryter(boolean isbryter) {
        this.isbryter = isbryter;
    }

}

public class BåtEksempel {
    public static void main(String[] args) {
        Båt mcBoatFace = new Båt("BoatyMcBoatface ", true);
        System.out.println(mcBoatFace.getNavn());
    }
}
