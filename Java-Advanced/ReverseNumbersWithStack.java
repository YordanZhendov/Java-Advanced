package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] input=scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers=new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            numbers.push(Integer.parseInt(input[i]));
        }

        numbers.stream()
                .sorted(Comparator.reverseOrder());
        int size=numbers.size();

        for (int i = 0; i < size; i++) {
            System.out.print(numbers.pop()+" ");

        }

    }
}
