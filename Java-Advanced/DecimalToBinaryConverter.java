package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<Integer> binary=new ArrayDeque<>();
        int givenNumber=Integer.parseInt(scanner.next());

        if(givenNumber==0){
            System.out.println("0");
        }else {
            while (givenNumber !=0){
                binary.push(givenNumber%2);
                givenNumber/=2;
            }
        }

        for (Integer token:binary) {
            System.out.print(token);
        }

    }

}
