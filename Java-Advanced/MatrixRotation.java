import java.util.ArrayDeque;
import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split("\\(");
        String[] number = command[1].split("\\)");
        int degree = Integer.parseInt(number[0]) / 90;

        boolean first = false;
        boolean second = false;
        boolean third = false;
        boolean forth = false;
        int count = degree;
        while (count > 0) {

            if (count-- == 0) {
                first = true;
                break;
            }
            if (count-- == 0) {
                second = true;
                break;
            }
            if (count-- == 0) {
                third = true;
                break;
            }
            if (count-- == 0) {
                forth = true;
                break;
            }
        }
        if (!first && !second && !third && !forth){
            printMatrix0(scanner);
        }

        if (second) {
            printMatrix90(scanner);
        } else if (third) {
            printMatrix180(scanner);

        } else if (forth) {
            printMatrix270(scanner);
        }

    }

    private static void printMatrix0(Scanner scanner) {
        ArrayDeque<String> queue = getWords(scanner);
        String longestWord = "";
        for (int i = 0; i < queue.size(); i++) {
            String currWord = queue.poll();
            if (longestWord.length() < currWord.length()) {
                longestWord = currWord;
            }
            queue.offer(currWord);
        }

        char[][] matrix = new char[queue.size()][longestWord.length()];

        for (int i = 0; i < matrix.length; i++) {
            char[] currWordArray = queue.poll().toCharArray();
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < currWordArray.length) {
                    matrix[i][j] = currWordArray[j];
                } else {
                    matrix[i][j] = ' ';
                }

            }
        }


        for (char[] chars : matrix) {
            System.out.println(chars);
        }
    }

    private static void printMatrix180(Scanner scanner) {
        ArrayDeque<String> queue = getWords(scanner);
        String longestWord = "";
        for (int i = 0; i < queue.size(); i++) {
            String currWord = queue.poll();
            if (longestWord.length() < currWord.length()) {
                longestWord = currWord;
            }
            queue.offer(currWord);
        }

        char[][] matrix = new char[queue.size()][longestWord.length()];

        for (int i = matrix.length - 1; i >= 0; i--) {
            char[] currWordArray = queue.poll().toCharArray();
            int letterCount = 0;
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (letterCount < currWordArray.length) {
                    matrix[i][j] = currWordArray[letterCount];
                    letterCount++;
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }


        for (char[] chars : matrix) {
            System.out.println(chars);
        }

    }

    private static void printMatrix270(Scanner scanner) {
        ArrayDeque<String> queue = getWords(scanner);
        String longestWord = "";
        for (int i = 0; i < queue.size(); i++) {
            String currWord = queue.poll();
            if (longestWord.length() < currWord.length()) {
                longestWord = currWord;
            }
            queue.offer(currWord);
        }

        char[][] matrix = new char[longestWord.length()][queue.size()];
        int sizeQueue = queue.size();
        for (int i = 0; i < sizeQueue; i++) {
            char[] currWordArray = queue.poll().toCharArray();
            int count = matrix.length - 1;
            int index = 0;
            while (count > 0 || count == 0) {
                if (index < currWordArray.length) {
                    matrix[count][i] = currWordArray[index];
                } else {
                    matrix[count][i] = ' ';
                }
                count--;
                index++;
            }

        }

        for (char[] chars : matrix) {
            System.out.println(chars);
        }
    }

    private static void printMatrix90(Scanner scanner) {
        ArrayDeque<String> queue = getWords(scanner);
        String longestWord = "";
        for (int i = 0; i < queue.size(); i++) {
            String currWord = queue.poll();
            if (longestWord.length() < currWord.length()) {
                longestWord = currWord;
            }
            queue.offer(currWord);
        }

        char[][] matrix = new char[longestWord.length()][queue.size()];

        for (int i = queue.size(); i > 0; i--) {
            char[] currWordArray = queue.poll().toCharArray();
            int count = 0;
            while (count < matrix.length) {
                if (currWordArray.length > count) {
                    matrix[count][i - 1] = currWordArray[count];
                } else {
                    matrix[count][i - 1] = ' ';
                }
                count++;
            }

        }

        for (char[] chars : matrix) {
            System.out.println(chars);
        }

    }

    private static ArrayDeque<String> getWords(Scanner scanner) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            queue.offer(input);
            input = scanner.nextLine();
        }
        return queue;
    }
}
