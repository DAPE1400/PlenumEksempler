package Lecture10.AdjetivFortellingVerson2Live;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFiles {
    public static ArrayList<String> readStory(){
        ArrayList <String> storyTokens = new ArrayList<>();
        File story = new File("files/AdjFortelling/fortelling.txt");
        try (Scanner scanner = new Scanner(story)){
            scanner.useDelimiter(" ");
            while(scanner.hasNext()){
                 storyTokens.add(scanner.next()) ;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Noe gikk feil med lesing av fortelling fil");
        }
        System.out.println(storyTokens);
        return storyTokens;
    }

    public static ArrayList<String> readAdj(){
         ArrayList <String> AdjList = new ArrayList<>();
        File story = new File("files/AdjFortelling/adjektiv.txt");
        try (Scanner scanner = new Scanner(story)){
            while(scanner.hasNextLine()){
                 AdjList.add(scanner.nextLine()) ;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Noe gikk feil med lesing av adj fil");
        }
        System.out.println(AdjList);
        return AdjList;
    }
}
