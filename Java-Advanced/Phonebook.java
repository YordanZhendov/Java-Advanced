import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contacts = new HashMap<>();

        String input;

        while (!"search".equals(input = scanner.nextLine())) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String phoneNumber = tokens[1];

            contacts.put(name, phoneNumber);
        }

        while (!"stop".equals(input = scanner.nextLine())) {
            if (contacts.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, contacts.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
        }
    }
}
