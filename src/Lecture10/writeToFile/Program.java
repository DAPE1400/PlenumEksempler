package Lecture10.writeToFile;

import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public void methodA() throws IOException {
        System.out.println("In methodA...");
        System.out.println("Calling methodB...");
        methodB();
        System.out.println("MethodA done! Returning to caller.");
    }

    public void methodB() throws IOException {
        System.out.println("In methodB...");
        System.out.println("Calling methodC...");
        methodC();
        System.out.println("MethodB done! Returning to caller.");
    }

    public void methodC() throws IOException {
        System.out.println("In methodC...");
        FileWriter writer = new FileWriter("ut.txt");
        writer.write("Dette er en test!\n");
        writer.write("Ser ut som om det gikk bra!!!");
        writer.close();

        System.out.println("MethodC done! Returning to caller.");
    }
}
