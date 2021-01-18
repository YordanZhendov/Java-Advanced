import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int rows=Integer.parseInt(scanner.nextLine());
        int cols=Integer.parseInt(scanner.nextLine());

        char [][] firstMatrix=getMatrix(rows,cols,scanner);
        char [][] secondMatrix=getMatrix(rows,cols,scanner);

        for (int i = 0; i <firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if(firstMatrix[i][j]!=secondMatrix[i][j]){
                    System.out.print("*");

                }else {
                    System.out.print(firstMatrix[i][j]);
                }
            }
            System.out.println();

        }

    }

    private static char[][] getMatrix(int rows,int cols,Scanner scanner) {

        char [][] matrix=new char[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i]=readArray(scanner);
        }
        return matrix;
    }

    private static char[] readArray(Scanner scanner) {
        String input=scanner.nextLine();
        return input.toCharArray();
    }
}
