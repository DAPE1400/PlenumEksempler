package Lecture10.callStack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting main");
        Program p = new Program();
        System.out.println("Calling methodA");
        p.methodA();
        System.out.println("main done. Program done:)");
    }
}
