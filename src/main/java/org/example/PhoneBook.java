import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        Set<String> numbers = phoneBook.getOrDefault(name, new HashSet<>());
        numbers.add(phoneNumber);
        phoneBook.put(name, numbers);
    }

    public Set<String> findContact(String name) {
        return phoneBook.get(name);
    }

    public void displayContacts() {
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Номер телефона: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Алиса", "1234567890");
        phoneBook.addContact("Алиса", "0987654321");
        phoneBook.addContact("Владимир", "1112223333");

        System.out.println("Все контакты:");
        phoneBook.displayContacts();

        System.out.println("\nНомера Алисы:");
        Set<String> AlisaNumbers = phoneBook.findContact("Алиса");
        if (AlisaNumbers != null) {
            for (String number : AlisaNumbers) {
                System.out.println(number);
            }
        } else {
            System.out.println("Номер не найден");
        }
    }
}

