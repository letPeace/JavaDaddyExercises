package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask4_Books;

public class Book implements Comparable<Book> {
    private String title;
    private Integer year;

    public Book(String title, Integer year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название: "+ title+ " год выхода: "+year;
    }

    @Override
    public int compareTo(Book o) {
        return this.year.compareTo(o.year);
    }
}
