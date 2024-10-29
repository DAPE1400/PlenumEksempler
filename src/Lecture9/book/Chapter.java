package Lecture9.book;

public class Chapter {
    private String title;
    private int numberOfPages;
    private int readingTime;

    public Chapter(String title, int numberOfPages, int readingTime) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.readingTime = readingTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(int readingTime) {
        this.readingTime = readingTime;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", readingTime=" + readingTime +
                '}';
    }
}
