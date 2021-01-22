import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double,Integer> averageMet=new LinkedHashMap<>();

        for (double currNum : input) {
            averageMet.putIfAbsent(currNum, 0);
            int currcount = averageMet.get(currNum);
            averageMet.put(currNum, currcount + 1);
        }
        averageMet.forEach((k,v)->{
            System.out.printf("%.1f -> %d%n",k,v);
        });

    }
}

