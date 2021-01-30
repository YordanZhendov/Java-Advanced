
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listInput = scanner.nextLine().split(" ");
        Predicate<String> isUpper= n->Character.isUpperCase(n.charAt(0));
        List<String> result = new ArrayList<>();

        for (int i = 0; i < listInput.length; i++) {
            if(isUpper.test(listInput[i])){
                result.add(listInput[i]);
            }
        }

        Consumer<String> print= System.out::println;
        System.out.println(result.size());
        result.forEach(print);

    }
}
