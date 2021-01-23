import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class AcadamyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> grads = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double[] doubles = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            grads.putIfAbsent(student, new ArrayList<>());
            for (double aDouble : doubles) {
                grads.get(student).add(aDouble);
            }

        }

        grads.forEach((a, b) -> {
            System.out.print(a + " ");


            double total=0;
            double avg=0;

            for(int i = 0; i < b.size(); i++) {
                total += b.get(i);
                avg = total / b.size();
            }
            String output=String.valueOf(avg);
            output.replaceAll("\\.0*$","");
            System.out.println("is graduated with "+output);

        });


    }
}
