import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum3x3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] subMatrix=getSum3x3(scanner);

        int totalSum=0;
        for (int matrix : subMatrix) {
            totalSum += matrix;
        }
        System.out.printf("Sum = %d",totalSum);
        for (int i = 0; i < subMatrix.length; i++) {
            totalSum+=subMatrix[i];
            if (i%3==0){
                System.out.println();
                System.out.print(subMatrix[i]+" ");
            }else {
                System.out.print(subMatrix[i]+" ");
            }
        }

    }


    private static int[] getSum3x3(Scanner scanner) {
        int [][] matrix=getMatrix(scanner);
        int[][] subMatrix=new int[3][3];

        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        int k=0;

        int [] number=new int[9];
        int biggest=Integer.MIN_VALUE;
        for (int i = 0; i <matrix.length-2 ; i++) {
            for (int j = 0; j < matrix[i].length-2; j++) {
                a=matrix[i][j];
                b=matrix[i][j+1];
                c=matrix[i][j+2];

                d=matrix[i+1][j];
                e=matrix[i+1][j+1];
                f=matrix[i+1][j+2];

                g=matrix[i+2][j];
                h=matrix[i+2][j+1];
                k=matrix[i+2][j+2];
                int currSum=a+b+c+d+f+g+e+h+k;
                if(currSum>biggest){
                    biggest=currSum;
                    int [] currNumbers= new int[]{a, b, c, d, e, f, g, h, k};
                    for (int in = 0; in < currNumbers.length; in++) {
                        number[in]=currNumbers[in];

                    }

                }
            }
        }
        return number;
    }

    private static int[][] getMatrix(Scanner scanner) {
        int[] inputArray=readArray(scanner);

        int rows=inputArray[0];
        int cols=inputArray[1];

        int [][] matrix=new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i]=readArray(scanner);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {

        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

    }
}
