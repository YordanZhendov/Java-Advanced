import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Set<String> vipList=new TreeSet<>();
        Set<String> regularList=new TreeSet<>();

        String input=scanner.nextLine();

        while (!"PARTY".equals(input)){
            if(Character.isDigit(input.charAt(0))){
                if(!vipList.contains(input)){
                    vipList.add(input);
                }else {
                    input=scanner.nextLine();
                    continue;
                }
            }else {
                if(!regularList.contains(input)){
                    regularList.add(input);
                }else {
                    input=scanner.nextLine();
                    continue;
                }
            }
            input=scanner.nextLine();
        }

        input=scanner.nextLine();
        while (!"END".equals(input)){
            if(Character.isDigit(input.charAt(0))){
                if(vipList.contains(input)){
                    vipList.remove(input);
                }else {
                    input=scanner.nextLine();
                    continue;
                }
            }else {
                if(regularList.contains(input)){
                    regularList.remove(input);
                }else {
                    input=scanner.nextLine();
                    continue;
                }
            }

            input=scanner.nextLine();
        }

        System.out.println(vipList.size()+regularList.size());
        for (String s : vipList) {
            System.out.println(s);
        }
        for (String s : regularList) {
            System.out.println(s);
        }
    }
}
