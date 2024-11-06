package Lecture10.AdjektivFortelling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadInFiles {
    public static ArrayList<String> readInFortelling() {
        File file = new File("files/AdjFortelling/fortelling.txt");
        ArrayList<String> list = new ArrayList<>();
        try (Scanner input = new Scanner(file)){

            // Normally next and hasNext splits on all whitespace, including newlines.
            // The useDelimiter overwrites this to only split on space allowing us to keep more of the formatting
            // alternative solutions are reading in the entire file into a big string, and split on space.
            input.useDelimiter(" ");

            while(input.hasNext()){
                String s = input.next();
                list.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("darn, something went wrong with finding the file");
            e.printStackTrace();
        }

        return list;
    }
    public static ArrayList<String> readInAdjektivList(){
        File file = new File("files/AdjFortelling/adjektiv.txt");
        ArrayList<String> list = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while(input.hasNextLine()){
                String s = input.nextLine();
                list.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("darn, something went wrong with finding the file");
            e.printStackTrace();
        }

        return list;
    }
}
