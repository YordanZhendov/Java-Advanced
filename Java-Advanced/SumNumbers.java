
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int count=0;
        int totalSum=0;

        int [] numbers= Arrays.stream(scanner.nextLine().split(", "))
        .mapToInt(Integer::parseInt).toArray();

        System.out.printf("Count = %d%n",count = numbers.length);
        System.out.printf("Sum = %d%n",Arrays.stream(numbers).sum());
    }
}
