package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> urls = new ArrayDeque<>();
        ArrayDeque<String> forwardUrls = new ArrayDeque<>();

        String input;

        while (!("Home").equals(input = scanner.nextLine())) {
            if (input.equals("back")) {
                if (urls.size() < 2) {
                    System.out.println("no previous URLs");

                } else {
                    forwardUrls.addFirst(urls.pop());
                    System.out.println(urls.peek());

                }
            } else if (input.equals("forward")) {
                if (forwardUrls.size() < 1) {
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forwardUrls.peek());
                    urls.push(forwardUrls.pop());
                }
            } else {
                System.out.println(input);
                urls.push(input);
                forwardUrls.clear();
            }
        }
    }
}
