import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix = getMatrix(scanner);

        int index=0;
        while (index<matrix.length){
            int output=matrix[index][index];
            System.out.print(output+" ");
            index++;
        }

        System.out.println();
        index=0;
        int count=matrix.length-1;
        while (0<=count){
            int output=matrix[count][index];
            System.out.print(output+" ");
            count--;
            index++;
        }


    }

    private static int[][] getMatrix(Scanner scanner) {
        int[] matrixParams = readArray(scanner);
        int rows = matrixParams[0];

        int[][] matrix = new int[rows][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readArray(scanner);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }

}
