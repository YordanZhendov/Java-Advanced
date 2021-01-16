package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String[] parts=scanner.nextLine().split("");

        ArrayDeque<String> bracketsStack=new ArrayDeque<>();

        boolean past=true;
        for (int i = 0; i < parts.length; i++) {
            String input=parts[i];
            if(!(input.equals(")") || input.equals("]") || input.equals("}") ||
            (input.equals("(") || input.equals("[") || input.equals("{")))){
                past=false;
                break;
            }

            if(input.equals(")") || input.equals("]") || input.equals("}")){

                if(bracketsStack.isEmpty()){
                    past=false;
                    break;
                }

                String currPopped=bracketsStack.pop();

                if(currPopped.equals("(") && input.equals(")")){
                    past=true;
                }else if(currPopped.equals("[") && input.equals("]")){
                    past=true;
                }else if(currPopped.equals("{") && input.equals("}")){
                    past=true;
                }else {
                    past=false;
                    break;
                }
            }else {
                bracketsStack.push(input);
            }
        }

        if(past){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
