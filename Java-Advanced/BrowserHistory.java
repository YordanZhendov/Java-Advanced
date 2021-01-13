package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<String> stackUrls=new ArrayDeque<>();

        String inputLines=scanner.nextLine();
        String currentUrl="";
        while (!inputLines.equals("Home")){

            if(inputLines.equals("back")){
                if(!stackUrls.isEmpty()){
                    currentUrl=stackUrls.pop() ;
                }else {
                    System.out.println("no previous URLs");
                    inputLines=scanner.nextLine();
                    continue;
                }


            }else {
               if(!currentUrl.isEmpty()){
                   stackUrls.push(currentUrl);
               }
               currentUrl=inputLines;

            }

            System.out.println(currentUrl);
            inputLines=scanner.nextLine();
        }
    }
}
