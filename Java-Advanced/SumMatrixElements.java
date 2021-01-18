import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int [][] matrix=getMatrix(scanner);

        int sumNumbers=0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sumNumbers += anInt;
            }
        }

        System.out.println(sumNumbers);
    }

    private static int[][] getMatrix(Scanner scanner) {
        int[] matrixParam= readArray(scanner);
        int rows=matrixParam[0];
        int cols=matrixParam[1];
        printParams(rows,cols);

        int [][] matrix=new int[rows][cols];
        for (int i = 0; i <matrix.length ; i++) {
            matrix[i]=readArray(scanner);
        }
        return matrix;
    }

    private static void printParams(int rows, int cols) {
        System.out.println(rows);
        System.out.println(cols);
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
    }
}
