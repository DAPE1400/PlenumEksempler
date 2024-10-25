package Lecture10.writeToFile;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        FileWriter writer = new FileWriter("files/ut.txt");
        writer.write("Dette er en test!\n");
        writer.write("Ser ut som om det gikk bra!!!");
        writer.close();
    }
}
