import java.io.*;
import java.util.HashSet;
import java.util.Set;


public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("src/input.txt");

        FileOutputStream fileOutputStream = new FileOutputStream("src/output.txt");

        PrintWriter writer = new PrintWriter(fileOutputStream);


        int oneByte = fileInputStream.read();
        while (oneByte >= 0) {

            if(oneByte == 32){
                writer.print(" ");
            }else if(oneByte==10){
                writer.println();
            }else {
                writer.print(oneByte);
            }

            oneByte=fileInputStream.read();
        }

        writer.close();

    }
}
