package Lecture11;

import java.io.FileWriter;
import java.io.IOException;

public class SherlockCode {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("mystery_clues.txt")){
            writer.write("Clue 1: A single blue sock, left under a lamppost. \n");
            writer.write("Clue 2: Half-eaten sandwich with extra mustard, abandoned near the fountain. \n");
            writer.write("Clue 3: A whispering rubber duck found in the library's darkest corner. \n");
            writer.write("Clue 4: An old map, but only showing directions to the nearest bakery. \n");
        } catch (IOException e) {
        }
        System.out.println("Clues saved to file.");
    }
}