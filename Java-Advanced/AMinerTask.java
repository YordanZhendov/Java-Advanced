import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String input;

        while (!"stop".equals(input = scanner.nextLine())) {
            String res = input;
            int num = Integer.parseInt(scanner.nextLine());

            if(!resources.containsKey(res)) {
                resources.put(res, num);
            }else {
                int total=resources.get(res)+num;
                resources.put(res,total);
            }
        }

        resources.forEach((k, v) -> {
            System.out.printf("%s -> %d%n",k,v);
        });

    }
}
