import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());


        upperRow(n);
        lowerRow(n);

    }

    private static void lowerRow(int n) {
        int downStart=n-1;
        int down=0;
        for (int i = n; i >=0 ; i--) {
            for (int j = down+i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = downStart; j >0 ; j--) {
                System.out.print("* ");
            }
            downStart--;

            System.out.println();
        }
    }

    private static void upperRow(int n) {
        int start=1;
        for (int i = 0; i < n; i++) { ;
            for (int j = 1; j <n-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < start; j++) {
                System.out.print("* ");
            }
            start++;
            System.out.println();
        }
    }


}
