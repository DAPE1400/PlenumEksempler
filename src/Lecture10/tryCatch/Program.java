package Lecture10.tryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public void readFromFile(String filename) {
        File file = new File(filename);
        Scanner input = null;
        try {
            input = new Scanner(file);
            while(input.hasNextLine()){
                String s = input.nextLine();
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read file. Exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Look, finally always runs...");
            if(input != null){
                input.close();
            }
        }
        System.out.println("Returning from readFromFile");
    }


}
