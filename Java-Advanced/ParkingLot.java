import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        LinkedHashSet<String> cars=new LinkedHashSet<>();

        String input=scanner.nextLine();
        while (!"END".equals(input)){
            String[] tokens=input.split(", ");
            String command=tokens[0];
            String carNumber=tokens[1];

            if("IN".equals(command)){
                if(!cars.contains(carNumber)){
                    cars.add(carNumber);
                }else {
                    input=scanner.nextLine();
                    continue;
                }
            }else{
                if(cars.contains(carNumber)){
                    cars.remove(carNumber);
                }else {
                    input=scanner.nextLine();
                    continue;
                }
            }

            input=scanner.nextLine();
        }

        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String car : cars) {
                System.out.println(car);
            }
        }

    }
}
