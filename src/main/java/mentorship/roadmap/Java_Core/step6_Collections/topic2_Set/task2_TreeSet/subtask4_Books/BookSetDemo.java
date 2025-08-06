package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask4_Books;

import java.util.Set;
import java.util.TreeSet;

public class BookSetDemo {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        books.add(new Book("Оно", 1986));
        books.add(new Book("Идиот", 1869));
        books.add(new Book("Вий", 1835));
        books.add(new Book("Хоббит", 1937));

        for(Book book : books){
            System.out.println(book);
        }
    }
}
