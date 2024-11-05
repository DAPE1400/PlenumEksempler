package Lecture10.AdjektivFortelling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WriteNewStories {
    public static void SaveStory(String story){
        String filename = "story " + new Date().getTime() + ".txt";

        try (FileWriter fw = new FileWriter("files/AdjFortelling/" + filename);) {
            fw.write(story);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("oh no.... could not write file");
        }

    }
}
