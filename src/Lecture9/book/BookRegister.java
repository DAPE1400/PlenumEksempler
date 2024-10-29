package Lecture9.book;

import java.util.ArrayList;

public class BookRegister {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public int numberOfBooks(){
        return books.size();
    }

    public void allBooksInRegister(){
        for (Book b :
                books) {
            System.out.println(b.toString());
        }
    }

    public void booksByGenre(String genre){
        for (Book b :
                books) {
            if(b.getGenre().equalsIgnoreCase(genre)){
                System.out.println(b.toString());
            }
        }
    }

    public void booksByAuthor(String author){
        for (Book b :
                books) {
            if(b.getAuthor().equals(author)){
                System.out.println(b);
            }
        }
    }

    public ArrayList<Book> booksByReadingTime(int minutes){
        ArrayList<Book> booksToReturn = new ArrayList<>();
        for (Book b :
                books) {
            if(b.readingTime()<=minutes){
                booksToReturn.add(b);
            }
        }
        return booksToReturn;
    }
}
