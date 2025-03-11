package mentorship.roadmap.Java_Core.step5_AdvancedBase.exceptions.task3_FileNotFoundException.solution;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonexistent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден.");
        }
    }
}
