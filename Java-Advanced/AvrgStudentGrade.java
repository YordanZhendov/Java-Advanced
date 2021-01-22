import java.util.*;

public class AvrgStudentGrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students=new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens=scanner.nextLine().split("\\s+");
            String name=tokens[0];
            double grade= Double.parseDouble(tokens[1]);

            students.putIfAbsent(name,new ArrayList<>());
            students.get(name).add(grade);
        }


        students.forEach((k,v)->{
            System.out.print(k+" -> ");
            for (Double aDouble : v) {
                System.out.printf("%.2f ",aDouble);
            }
            double total=0;
            double avg=0;

            for(int i = 0; i < v.size(); i++) {
                total += v.get(i);
                avg = total / v.size();
            }
            System.out.printf("(avg: %.2f)",avg);
            System.out.println();

        });


    }
}
