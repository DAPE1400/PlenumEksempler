package Lecture10.tryWithResources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public void readFromFile(String fileName){
        File file = new File(fileName);
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read file. Exception: " + e.getMessage());
            e.printStackTrace();
            System.out.println("At least the scanner is closed properly...");
        }
    }
}
