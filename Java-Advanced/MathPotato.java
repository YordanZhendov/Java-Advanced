package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> names = new ArrayDeque<>();

        String[] participants = scanner.nextLine().split("\\s+");
        int nSteps = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < participants.length; i++) {
            names.offer(participants[i]);
        }

        int cycle = 1;

        while (names.size() > 1) {
            for (int i = 1; i < nSteps; i++)
                names.offer(names.poll());
            if (isPrime(cycle)) {

                System.out.println("Prime " + names.peek());
            } else {

                System.out.println("Removed " + names.poll());
            }

            cycle++;

        }
        System.out.println("Last is " + names.poll());
    }

    private static boolean isPrime(int cycle) {

        int i,m=0;
        int n=cycle;
        m=n/2;

        boolean flag=true;
        if(n==0||n==1){
            return flag=false;
        }else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    return flag=false;
                }
            }
        }
        return flag;
    }
}
