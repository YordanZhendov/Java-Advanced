
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> countedElements = new TreeMap<>();

        char[] input = scanner.nextLine().toCharArray();

        for (char curr : input) {
            if (!countedElements.containsKey(curr)) {
                countedElements.put(curr, 1);
            } else {
                int counts = countedElements.get(curr) + 1;
                countedElements.put(curr, counts);
            }
        }

        countedElements.forEach((k, v) -> {
            System.out.printf("%s: %d time/s%n",k,v);

        });
        System.out.println();

    }
}
