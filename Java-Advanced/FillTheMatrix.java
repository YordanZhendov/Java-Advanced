import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = readArray(scanner);
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[0]);
        String pattern = input[1];

        if ("A".equals(pattern)) {
            int[][] aMatrix = getAmatrix(rows, cols);
            printA(aMatrix);
        } else {
            int[][] bMatrix = getBmatrix(rows, cols);
            printB(bMatrix);
        }
    }

    private static void printB(int[][] bMatrix) {
        for (int[] matrix : bMatrix) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }

    private static void printA(int[][] aMatrix) {
        for (int[] matrix : aMatrix) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getAmatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        int count = 0;
        for (int a = 0; a < matrix.length; a++) {
            for (int i = 0; i < matrix.length; i++) {
                count++;
                matrix[i][a] = count;
            }
        }
        return matrix;
    }

    private static int[][] getBmatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        int count = 0;
        for (int a = 0; a < matrix.length; a++) {
            if (a % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    count++;
                    matrix[i][a] = count;
                }
            } else {
                for (int i = matrix.length-1; i >=0; i--) {
                    count++;
                    matrix[i][a] = count;
                }
            }
        }
        return matrix;
    }


    private static String[] readArray(Scanner scanner) {
       return scanner.nextLine().split(", ");


    }
}
