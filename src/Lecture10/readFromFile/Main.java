package Lecture10.readFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/eksempel.txt");
        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(input.hasNextLine()){
            String s = input.nextLine();
            System.out.println(s);
        }
        input.close();
    }


}
