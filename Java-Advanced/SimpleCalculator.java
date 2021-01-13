package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<Integer> numbersCalc=new ArrayDeque<>();

        String[] tokens=scanner.nextLine().split("\\s+");

        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("-")){
                int currNUm=numbersCalc.pop();
                int nextNum=Integer.parseInt(tokens[i+1]);
                int resultNUm=currNUm-nextNum;
                numbersCalc.push(resultNUm);
                i++;

            }else if(tokens[i].equals("+")){
                int currNum=numbersCalc.pop();
                int nextNum=Integer.parseInt(tokens[i+1]);
                int resultNum=currNum+nextNum;
                numbersCalc.push(resultNum);
                i++;
            }

            if(numbersCalc.size()==0){
                numbersCalc.push(Integer.parseInt(tokens[i]));
            }
        }
        System.out.println(numbersCalc.peek());
    }
}
