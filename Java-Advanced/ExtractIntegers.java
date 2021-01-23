import java.io.*;
import java.util.Scanner;


public class ExtractIntegers {
    public static void main(String[] args) throws IOException {

        Scanner reader=new Scanner(new FileInputStream("src/input.txt"));
        PrintWriter writer = new PrintWriter(new FileOutputStream("src/output.txt"));


        while (reader.hasNext()) {
            if(reader.hasNextInt()){

                int num=reader.nextInt();
                writer.write(String.valueOf(num));
                writer.write(System.lineSeparator());
            }else {

                reader.next();
            }

        }

        writer.flush();
        writer.close();

    }
}
