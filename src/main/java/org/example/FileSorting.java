import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileSorting {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        String filePath = "C:\\Users\\саша\\Desktop\\kr3isp\\src\\main\\java\\org\\example\\input.txt";

        // Чтение строк из файла и запись их в список
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
        // Сортировка строк
        Collections.sort(lines);
        // Вывод отсортированных строк
        System.out.println("Отсортированные в алфавитном порядке строки:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
