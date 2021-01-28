
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, String> people=new LinkedHashMap<>();
        String input;

        while (!"stop".equals(input=scanner.nextLine())){
            String nameOfThePerson=input;
            String email=input=scanner.nextLine();
            String[] tokens=email.split("\\.");

            if(tokens[tokens.length-1].equals("bg")){
                people.putIfAbsent(nameOfThePerson,email);
            }else {
                continue;
            }
        }

        people.forEach((k,v)->{
            System.out.printf("%s -> %s%n",k,v);
        });
    }
}
