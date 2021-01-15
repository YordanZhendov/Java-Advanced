package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String [] commands=scanner.nextLine()
                .split("\\s+");
        int [] intCommands= Arrays.stream(commands)
                .mapToInt(Integer::parseInt)
                .toArray();

        int n=intCommands[0];
        int s=intCommands[1];
        int x=intCommands[2];

        commands=scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbersQueue=new ArrayDeque<>();


        for (int i = 0; i < n; i++) {
            numbersQueue.offer(Integer.parseInt(commands[i]));
        }

        for (int i = 0; i < s; i++) {
            numbersQueue.poll();
        }

        if(numbersQueue.contains(x)){
            System.out.println("true");
        }else if(numbersQueue.isEmpty()){
                System.out.println(0);
        }else {
            System.out.println(Collections.min(numbersQueue));
        }
    }
}
