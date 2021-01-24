import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Map<String, Double>>> outputCollection = new TreeMap<>();


        while (!"Revision".equals(input)) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            outputCollection.putIfAbsent(shop, new ArrayList<>());
            outputCollection.get(shop).add(new LinkedHashMap<>());
            outputCollection.get(shop).get(0).putIfAbsent(product, price);


            input = scanner.nextLine();
        }

        outputCollection.forEach((k, v) -> {
            System.out.printf("%s->%n", k);
            for (int i = 0; i < v.size(); i++) {
                v.get(i).forEach((p, c) -> {
                    System.out.printf("Product: %s, ",p);
                    System.out.printf("Price: %.1f%n",c);
                });

            }
        });

    }
}
