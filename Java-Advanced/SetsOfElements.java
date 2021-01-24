import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int firstSetLength = ints[0];
        int secondSetLength = ints[1];

        Set<Integer> numbers = new LinkedHashSet<>();
        Set<Integer> numbersTwo = new LinkedHashSet<>();

        for (int f = 0; f < firstSetLength; f++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers.add(number);
        }
        for (int s = 0; s < secondSetLength; s++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbersTwo.add(number);
        }

        if (firstSetLength > secondSetLength) {
            numbers.retainAll(numbersTwo);
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        } else if (firstSetLength < secondSetLength) {
            numbersTwo.retainAll(numbers);
            for (Integer number : numbersTwo) {
                System.out.print(number + " ");
            }
        } else {
            numbers.retainAll(numbersTwo);
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}
