package Lecture9.book;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private String genre;
    private ArrayList<Chapter> chapters;

    public Book(String title, String author, int numberOfPages, String genre) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    public Book(String title, String author, int numberOfPages, String genre, ArrayList<Chapter> chapters) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    public int readingTime(){
        int sum = 0;
        for (Chapter c :
                chapters) {
            sum = sum + c.getReadingTime();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", genre=" + genre +
                ", chapters=" + chapters +
                '}';
    }
}
