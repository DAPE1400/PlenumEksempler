package Lecture9.book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookRegister br = new BookRegister();
        Book sult = new Book("Sult", "Knut Hamsun", 111, "CLASSIC", new ArrayList<>());
        br.addBook(sult);

        Book vitoria = new Book("Victoria", "Knut Hamsun", 75, "CLASSIC");
        ArrayList<Chapter> chapters = new ArrayList<>();
        Chapter chapter1 = new Chapter("Title1", 20, 30);
        chapters.add(chapter1);
        Chapter chapter2 = new Chapter("Title2", 25, 35);
        chapters.add(chapter2);
        vitoria.setChapters(chapters);
        br.addBook(vitoria);

        System.out.println("Number of books in register:"+br.numberOfBooks());
        br.allBooksInRegister();
        System.out.println("CLASSIC books:");
        br.booksByGenre("CLASSIC");
        System.out.println("FANTASY books:");
        br.booksByGenre("FANTASY");
        System.out.println("Books by Hamsun:");
        br.booksByAuthor("Knut Hamsun");
        System.out.println("Books by blabla:");
        br.booksByAuthor("blabla");

        System.out.println("By reading time 100");
        ArrayList<Book> books = br.booksByReadingTime(100);
        for (Book b :
                books) {
            System.out.println(b);
        }
        // What if I change Sult?
        System.out.println("Changing sult title");
        sult.setTitle("Kjempesulten!");
        System.out.println("All books:");
        br.allBooksInRegister();
    }
}
