import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2SubMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix = getMatrix(scanner);

        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int fourthNum = 0;
        int biggestNum = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int a = matrix[i][j];
                int b = matrix[i][j + 1];
                int c = matrix[i + 1][j];
                int d = matrix[i + 1][j + 1];
                int result = a + b + c + d;

                if (result > biggestNum) {
                    firstNum = a;
                    secondNum = b;
                    thirdNum = c;
                    fourthNum = d;
                    biggestNum = result;
                }
            }
        }

        System.out.printf("%d %d%n", firstNum, secondNum);
        System.out.printf("%d %d%n", thirdNum, fourthNum);
        System.out.println(biggestNum);
    }

    private static int[][] getMatrix(Scanner scanner) {
        int[] matrixParams = readArray(scanner);
        int rows = matrixParams[0];
        int cols = matrixParams[1];

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readArray(scanner);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }

}
