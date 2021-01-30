import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] numbers=scanner.nextLine().split(", ");

        ArrayList<String> num = new ArrayList<>(Arrays.asList(numbers));
        ArrayList<Integer> numInt = new ArrayList<>();

        num.removeIf(a->(Integer.parseInt(a)%2!=0));
        System.out.println(String.join(", ",num));

        num.stream()
                .mapToInt(Integer::parseInt)
                .forEach(numInt::add);
        Collections.sort(numInt);
        num.clear();
        numInt.forEach(a-> num.add(String.valueOf(a)));
        System.out.println(String.join(", ",num));
        System.out.println();
    }
}
