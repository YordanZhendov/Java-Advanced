import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] matrix=getMatrix(scanner);
        int primarySum=getPrimarySum(matrix);
        int secondarySum=getSecondarySum(matrix);
        printDifference(primarySum,secondarySum);

    }

    private static void printDifference(int primarySum, int secondarySum) {
        int result=Math.abs(primarySum-secondarySum);
        System.out.println(result);
    }

    private static int getSecondarySum(int[][] matrix) {
        int count= matrix.length-1;
        int countCol=0;
        int secondaryDiagonal=0;
        while (count>=0){
            secondaryDiagonal+= matrix[count][countCol];
            count--;
            countCol++;
        }
        return secondaryDiagonal;
    }

    private static int getPrimarySum(int[][] matrix) {
        int primaryDiagonal=0;

        int count=0;
        while (count< matrix.length){
            primaryDiagonal+= matrix[count][count];
            count++;
        }
        return primaryDiagonal;
    }

    private static int[][] getMatrix(Scanner scanner) {
        int[] inputArray=readArray(scanner);

        int rows=inputArray[0];
        int cols=inputArray[0];

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
