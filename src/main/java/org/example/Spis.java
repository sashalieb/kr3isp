/*Задание 2 */
import java.util.ArrayList;
import java.util.List;

public class Spis {
    // Метод для перестановки элементов списка так, чтобы сначала шли числа, не превосходящие X,
    // а затем числа, большие X
    public static void perestanovka (List<Integer> list, int x) {

        int n = 0;
        int m = list.size() - 1;

        // Пока они не встретятся
        while (n < m) {
            // Поиск элемента, большего X, с начала списка
            while (list.get(n) <= x && n < m) {
                n++;
            }
            // Поиск элемента, не превосходящего X, с конца списка
            while (list.get(m) > x && n < m) {
                m--;
            }
            // Если найдены элементы, удовлетворяющие условиям, меняем их местами
            if (n < m) {
                int temp = list.get(n);
                list.set(n, list.get(m));
                list.set(m, temp);
            }
        }
    }

    public static void main(String[] args) {
        // Число X
        int x = 5;
        // Исходный список
        List<Integer> list = new ArrayList<>(List.of(9, 8, 7, 6, 5, 4, 3, 2, 1));
        // Вызов метода для перестановки
        perestanovka(list, x);
        // Вывод результата
        System.out.println("Полученный список:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
