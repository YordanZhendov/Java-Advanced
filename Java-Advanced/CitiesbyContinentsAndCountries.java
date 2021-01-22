import java.util.*;

public class CitiesbyContinentsAndCountries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Map<String, Map<String, List<String>>> cityCC=new LinkedHashMap<>();


        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens=scanner.nextLine().split("\\s+");
            String continent=tokens[0];
            String country=tokens[1];
            String city=tokens[2];

            cityCC.putIfAbsent(continent,new LinkedHashMap<>());
            cityCC.get(continent).putIfAbsent(country,new ArrayList<>());
            cityCC.get(continent).get(country).add(city);

        }

        cityCC.forEach((k,v)->{
            System.out.printf("%s:%n",k);
                v.forEach((d,m)->{
                    System.out.printf("  %s -> ",d);
                    System.out.println(String.join(", ", m));
                });
        });
    }
}
