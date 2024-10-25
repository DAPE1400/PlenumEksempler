package Lecture10.menu;

import java.time.LocalDate;
import java.util.Scanner;

public class Program {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice!=3){
            System.out.println("Pick a number (1-3)");
            System.out.println("1: Enter date");
            System.out.println("2: Do something else");
            System.out.println("3: Quit");
            choice = scanner.nextInt();
            switch(choice){
                case 1 -> enterDate();
                case 2 -> doSomethingElse();
                case 3 -> quit();
                default -> System.out.println("Your options are 1-3");
            }

        }
    }

    private void quit() {
        System.out.println("Bye!");
    }

    private void doSomethingElse() {
        System.out.println("Doing something else");
    }

    private void enterDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date on format YYY-MM-DD");
        String s = scanner.nextLine();
        LocalDate ld = LocalDate.parse(s);
        System.out.println("Date was before now:"+ld.isBefore(LocalDate.now()));
    }
}
