import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix = getMatrix(scanner);
        int numberToCompare = Integer.parseInt(scanner.nextLine());

        boolean find = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currNum = matrix[i][j];
                if (currNum == numberToCompare) {
                    System.out.printf("%s %s%n", i, j);
                    find = true;
                }
            }
        }
        if (!find) {
            System.out.println("not found");
        }
    }

    private static int[][] getMatrix(Scanner scanner) {
        int[] matrixParams = readArrays(scanner);
        int rows = matrixParams[0];
        int cols = matrixParams[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readArrays(scanner);
        }
        return matrix;
    }

    private static int[] readArrays(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
