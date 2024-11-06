package Lecture10.AdjetivFortellingVerson2Live;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class StoryWriter {
    public static void writeStory(String story){
        try (FileWriter writer = new FileWriter("files/AdjFortelling/story " + new Date().getTime() + ".txt")){
            writer.write(story);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("uffda klarte ikke skrive til fil");
        }

    }
}
