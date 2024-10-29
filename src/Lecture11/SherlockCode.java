package Lecture11;

import java.io.FileWriter;
import java.io.IOException;

public class SherlockCode {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("mystery_clues.txt")){
            writer.write("Clue 1: A misplaced semicolon, lurking at the end of an important condition. \n");
            writer.write("Clue 2: A variable named 'temp' that seems to hold on to data longer than expected. \n");
            writer.write("Clue 3: A stack of empty coffee cups near the loop that never ends. \n");
            writer.write("Clue 4: A mysterious file labeled 'config_old_backup_final_final' found in a hidden folder. \n");
        } catch (IOException e) {
        }
        System.out.println("Clues saved to file.");
    }
}