package Lecture6;

import javax.swing.*;

class Robot{
    String navn;
    int batteri;

    public Robot(String navn, int batteri){
        this.navn = navn;
        this.batteri = batteri;
    }

    public void hondterHendelse(String hendelse){
        switch(hendelse){
            case "stein":
                batteri-=10;
                break;
            case "batteri":
                batteri+=20;
                break;
            case "menneske":
                batteri-=30;
                break;
            default:
                JOptionPane.showMessageDialog(null, "skriv inn rett da vel, skal være stein eller menneske eller batteri");
        }
        JOptionPane.showMessageDialog(null, "du har " + this.batteri +  " batter igjen");
    }
    public boolean tomForBatteri(){
        if(batteri<=0){
            return true;
        }
        return false;
    }
}

public class BotGame {
    public static void main(String[] args) {
        Robot robot = new Robot("GlassKanon-9000", 100);
        while(!robot.tomForBatteri()) {
            String hendelse = JOptionPane.showInputDialog("skriv inn enten stein || mennekse || batteri");
            robot.hondterHendelse(hendelse);
        }
        JOptionPane.showMessageDialog(null, "Game over!");
    }
}
