package Lecture10.AdjektivFortelling;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    public static final int AUTO = 1;
    public static final int MANUAL = 2;
    public static final int QUIT = 3;

    private ArrayList<String> adjektivsAutoList = null;
    private ArrayList<String> storyTokens = null;

    public Controller() {
        adjektivsAutoList = ReadInFiles.readInAdjektivList();
        storyTokens = ReadInFiles.readInFortelling();
        System.out.println(adjektivsAutoList);;
        System.out.println(storyTokens);
    }
    public void startMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while(choice != QUIT){
            System.out.println();
            System.out.println("Velkommen til adjektiv fortelling wizard");
            System.out.println("1. Lag adjektivhistorie automatisk");
            System.out.println("2. Lag adjektivhistorie med egne adjektiver");
            System.out.println("3. Avslutt");

            choice = scanner.nextInt();
            switch(choice){
                case AUTO -> autoStory();
                case MANUAL -> manualStory();
                case QUIT -> quit();
                default -> System.out.println("velg 1-3");
            }
        }
    }

    public void quit(){
        System.out.println("Takk for i dag og ha en fin dag!");
    }

    public void autoStory(){
        String story = buildStory(this.adjektivsAutoList);

        System.out.println();
        WriteNewStories.SaveStory(story);
    }

    public void manualStory(){
        ArrayList<String> adjList = new ArrayList<>();

        int numbOfAdjRemaining = 0;
        for  (String token : storyTokens){
            if(token.contains("__")){
                numbOfAdjRemaining++;
            }
        }

        Scanner scanner = new Scanner(System.in);
        for (; numbOfAdjRemaining!= 0; numbOfAdjRemaining--){
            System.out.println("Det er " + numbOfAdjRemaining + " gjennstående adjktiv i fortellingen gi meg en til");
            adjList.add(scanner.nextLine().replace("\n", ""));
        }

        String story = buildStory(adjList);

        WriteNewStories.SaveStory(story);
    }

    private String buildStory(ArrayList<String> adjList){
        Random rng = new Random();
        String story = "";
        for (int i = 0; i < storyTokens.size(); i++){
            String token = storyTokens.get(i);
            if (token.contains("__")){
                token = token.replace("__", adjList.get(rng.nextInt(adjList.size())));
                System.out.print(token + " ");
            } else {
                System.out.print(token + " ");
            }

            story += token +  " ";
        }

        System.out.println();
        return story;
    }
}
