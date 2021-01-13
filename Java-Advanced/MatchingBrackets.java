package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<Integer> indexes=new ArrayDeque<>();

        String input=scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='('){
                indexes.push(i);
            }else if(input.charAt(i)==')'){
                String context=input.substring(indexes.pop(),i+1);
                System.out.println(context);
            }

        }



    }
}
