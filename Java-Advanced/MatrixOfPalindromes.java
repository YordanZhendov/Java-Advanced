import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[][] filledMatrix = getFilledMatrix(scanner);

        for (int i = 0; i < filledMatrix.length; i++) {
            for (int j = 0; j < filledMatrix[i].length; j++) {

                System.out.print(filledMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String[][] getFilledMatrix(Scanner scanner) {
        String[][] matrix = getMatrix(scanner);

        char letters = (char) (96);
        StringBuilder inputMatrix = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            letters++;
            char midCount = letters;
            for (int j = 0; j < matrix[i].length; j++) {
                inputMatrix.append(letters);
                inputMatrix.append(midCount);
                inputMatrix.append(letters);
                midCount++;

                matrix[i][j] = inputMatrix.toString();
                inputMatrix = new StringBuilder();
            }
        }
        return matrix;
    }

    private static String[][] getMatrix(Scanner scanner) {
        int[] matrixParams = readArray(scanner);
        int rows = matrixParams[0];
        int cols = matrixParams[1];

        String[][] matrix = new String[rows][cols];
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}
