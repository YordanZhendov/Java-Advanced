package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String [] commands=scanner.nextLine()
        .split("\\s+");
        int [] intCommands=Arrays.stream(commands)
                .mapToInt(Integer::parseInt)
                .toArray();

        int n=intCommands[0];
        int s=intCommands[1];
        int x=intCommands[2];

        commands=scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbersStack=new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            numbersStack.push(Integer.parseInt(commands[i]));
        }

        for (int i = 0; i < s; i++) {
            numbersStack.pop();
        }

        if(numbersStack.contains(x)){
            System.out.println("true");
        }else {
            if(numbersStack.isEmpty()){
                System.out.println(0);
                return;
            }
            int minNum=numbersStack.pop();
            for (int i = 0; i < numbersStack.size(); i++) {
                if(numbersStack.peek()<minNum){
                    minNum=numbersStack.pop();
                }
            }
            System.out.println(minNum);

        }
    }
}
