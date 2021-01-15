package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;


public class maxElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int intCommands=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbers=new ArrayDeque<>();
        ArrayDeque<Integer> maxNum=new ArrayDeque<>();
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < intCommands; i++) {
            String[] currInput=scanner.nextLine().split("\\s+");
            int command=Integer.parseInt(currInput[0]);

            if(command==1){
                int numToPush=Integer.parseInt(currInput[1]);
                numbers.push(numToPush);
                if (max <= numToPush) {
                    max = numToPush;
                    maxNum.push(max);
                }
            }else if(command==2){
                int popNum=numbers.pop();
                if(popNum==max){
                    maxNum.pop();
                    if(maxNum.size()>0){
                        max=maxNum.peek();
                    }else {
                        max=Integer.MIN_VALUE;
                    }
                }

            }else{
                System.out.println(max);
            }
        }
    }
}
