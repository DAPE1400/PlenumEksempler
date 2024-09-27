package Lecture6;

class NapBot {
    private int hoursLeft;

    public void setHoursLeft(int hoursLeft) {
        System.out.println(this.hoursLeft);
        if (hoursLeft > 0){
            this.hoursLeft = hoursLeft;
        }
        else{
            System.out.println("hoursLeft cant be 0 or lower");
        }
    }

    public void suggestNap() {
        System.out.println("You have " + hoursLeft + " hours left. Time for a nap?");
    }
}

public class NapBotExample{
    public static void main(String[] args) {
        NapBot nappMaster600 = new NapBot();
        nappMaster600.setHoursLeft(600);
        nappMaster600.suggestNap();
        int[] x = new int[2];
        System.out.println(x[0]);


    }
}