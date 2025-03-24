package mentorship.roadmap.Java_Core.step4_OOP.topic3_Book.solution;

public class Book {

    private final String title;
    private final String author;
    private final int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ")";
    }
}
