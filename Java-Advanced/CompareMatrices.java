import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] firstMatrix = getMatrixFromConsole(scanner);
        int[][] secondMatrix = getMatrixFromConsole(scanner);

        boolean areEqual = true;
        if (firstMatrix.length != secondMatrix.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < firstMatrix.length; i++) {
                int[] firstColArray = firstMatrix[i];
                int[] secondColArray = secondMatrix[i];
                if (firstColArray.length != secondColArray.length) {
                    areEqual = false;
                } else {
                    for (int j = 0; j < firstColArray.length; j++) {
                        if (firstColArray[j] != secondColArray[j]) {
                            areEqual = false;
                            break;
                        }
                    }
                }
                if (!areEqual) {
                    break;
                }
            }
        }

        String output = areEqual ? "equal" : "not equal";
        System.out.println(output);
    }

    private static int[][] getMatrixFromConsole(Scanner scanner) {
        int[] readArray = getMatrixParams(scanner);
        int rows = readArray[0];
        int cols = readArray[1];

        int[][] mArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            mArray[i] = getMatrixParams(scanner);
        }
        return mArray;
    }

    private static int[] getMatrixParams(Scanner scanner) {
        return Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
