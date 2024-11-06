package Lecture10.AdjetivFortellingVerson2Live;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
    public static final int AUTO = 1;
    public static final int MANUAL = 2;
    public static final int QUIT = 3;
    public ArrayList<String> adjList;
    public ArrayList<String> story;

    public Controller(){
        adjList = ReadFiles.readAdj();
        story = ReadFiles.readStory();
    }
    public void startMenu(){

        Scanner scanner = new Scanner(System.in);
        int choice=0;
        while (choice!=QUIT){
            System.out.println("Pick a number (1-3)");
            System.out.println("1: Lag adjetivhistorie automatisk");
            System.out.println("2: Lag adjetivhistorie med egne adjetiver ");
            System.out.println("3: Quit");
            choice = scanner.nextInt();
            switch(choice){
                case AUTO -> adjAuto();
                case MANUAL -> adjManuel();
                case QUIT -> quit();
                default -> System.out.println("Your options are 1-3");
            }
        }

    }
    public void adjAuto(){
        System.out.println(adjList);

        String newStory = storyBuilder(adjList);

        StoryWriter.writeStory(newStory);
    }

    public void adjManuel(){
        int numbOfAdj = 0;
        ArrayList<String> manualAdjList = new ArrayList<>();
        for (String token : story){
            if(token.contains("__")){
                numbOfAdj++;
            }
        }
        Scanner scanner = new Scanner(System.in);
        for(; numbOfAdj>0; numbOfAdj--){
            System.out.println("Vi trenger flere adjektiv. Det kreves " + numbOfAdj + " flere");
            manualAdjList.add(scanner.nextLine());
        }

        String newStory = storyBuilder(manualAdjList);

        StoryWriter.writeStory(newStory);
    }

    public void quit(){
        System.out.println("takk for i dag");
    }

    private String storyBuilder(ArrayList<String> adj){
        Collections.shuffle(adj);

        int i = 0;
        String newStory = "";
        for (String token : story){
            if (token.contains("__")){
                token = token.replace("__", adj.get(i));
                i++;
            }
            newStory += token + " ";
            System.out.print(token + " ");
        }
        return newStory;
    }
}
