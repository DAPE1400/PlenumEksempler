package Lecture10.tryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public void readFromFile(String filename) {
        File file = new File("files/eksempel.txt");
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
            if(input != null){
                System.out.println("Look, finally always runs...");
                input.close();
            }
        }
    }


}
