package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<String> queueOfFiles=new ArrayDeque<>();
        String inputFileNames=scanner.nextLine();

        while (!inputFileNames.equals("print")){
            if(inputFileNames.equals("cancel")){
                if(queueOfFiles.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.printf("Canceled %s%n",queueOfFiles.poll());
                }

            }else {
                queueOfFiles.offer(inputFileNames);
            }

            inputFileNames=scanner.nextLine();
        }

        for (String file:queueOfFiles) {
            System.out.println(file);

        }
    }

}
