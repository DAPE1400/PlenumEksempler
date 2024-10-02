package Lecture5;

public class Main {
    public static void main(String[] args) {
        // Opprette to sykler
        Bicycle b1 = new Bicycle(5, 1);
        Bicycle b2 = new Bicycle(20,4);
        // Eksempel med tom konstruktør
        Bicycle b3 = new Bicycle();
        // Gi dem noen verdier for attributtene sine
        // b1 og b2 har satt dem via konstruktør
        // for b3 bruker vi settere
        b3.setSpeed(99);
        b3.setGear(9);
        // Sjekk om verdiene ble satt riktig
        System.out.println("Bicycle1:");
        b1.displayStatus();
        System.out.println("Bicycle2:");
        b2.displayStatus();
        System.out.println("Bicycle3:");
        b3.displayStatus();
        // Kall på metoder for å skifte gir og øke fart / bremse
        b1.setGear(2);
        b1.increaseSpeed(5);

        b2.decreaseSpeed(19);
        b2.setGear(1);
        // Sjekk om verdiene ble riktig oppdatert
        System.out.println("Bicycle1 updated:");
        b1.displayStatus();
        System.out.println("Bicycle2 updated:");
        b2.displayStatus();

        // Eksempel på bruk av getter
        System.out.println("B1.speed:"+b1.getSpeed());
    }
}
