package JavaStackAndQueues;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(";");
        String[] namesRobots=new String[input.length];
        int[] timeRobots=new int[input.length];
        for (int i = 0; i < input.length; i++) {

            String[] inputs = input[i].split("-");
            String nameRobot = inputs[0];
            int timeRobot = Integer.parseInt(inputs[1]);

            namesRobots[i]=nameRobot;
            timeRobots[i]=timeRobot;
        }

        String[] timeInput = scanner.nextLine().split(":");
        int hoursInput = Integer.parseInt(timeInput[0]);
        int minutesInput = Integer.parseInt(timeInput[1]);
        int secondInput = Integer.parseInt(timeInput[2]);

        int startTime = 3600 * hoursInput + 60 * minutesInput + secondInput;

        ArrayDeque<String> products = new ArrayDeque<>();
        String product;
        while (!"End".equals(product = scanner.nextLine())) {
            products.offer(product);
        }


        int[] robotWorkTimeLeft = new int[namesRobots.length];

        while (!products.isEmpty()) {
            startTime++;

            String currentProduct = products.poll();
            int index = -1;

            for (int i = 0; i < robotWorkTimeLeft.length; i++) {
                if (robotWorkTimeLeft[i] > 0) {
                    robotWorkTimeLeft[i]--;
                }

                if (robotWorkTimeLeft[i] == 0 && index == -1) {
                    index = i;
                }
            }

            if (index != -1) {
                robotWorkTimeLeft[index] = timeRobots[index];
                System.out.println(printRobotData(namesRobots[index],currentProduct,startTime));
            } else {
                products.offer(currentProduct);
            }
        }
    }

    private static String printRobotData(String namesRobot, String currentProduct, int startTime) {

        int hours=startTime/3600%24;
        int minutes=startTime/60%60;
        int seconds=startTime%60;
        String time=String.format("%02d:%02d:%02d",hours,minutes,seconds);

        return String.format("%s - %s [%s]",namesRobot,currentProduct,time);
    }
}
