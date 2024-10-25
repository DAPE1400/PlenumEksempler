package Lecture10.tryWithResources;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting main");
        Program p = new Program();
        System.out.println("Calling readFromFile");
        p.readFromFile("files/eksempel.txt");
        System.out.println("main done. Program done:)");
    }
}
