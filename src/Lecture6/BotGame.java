package Lecture6;
class Robot{
    String navn;
    int batteri;

    public Robot(String navn, int batteri){
        this.navn = navn;
        this.batteri = batteri;
    }
}
public class BotGame {
    public static void main(String[] args) {
        Robot robot = new Robot("GlassKanon-9000", 100);
    }
}
