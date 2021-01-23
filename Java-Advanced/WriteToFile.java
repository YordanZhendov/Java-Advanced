import java.io.*;
import java.util.HashSet;
import java.util.Set;


public class WriteToFile {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("src/input.txt");

        FileOutputStream fileOutputStream = new FileOutputStream("src/output.txt");

        PrintWriter writer = new PrintWriter(fileOutputStream);

        Set<Character> chars=new HashSet<>();
        chars.add('!');
        chars.add('?');
        chars.add('.');
        chars.add(',');

        int oneByte = fileInputStream.read();
        while (oneByte >= 0) {
            char symbol=(char) oneByte;

            if(!chars.contains(symbol)){
                writer.print(symbol);
            }else {
                oneByte=fileInputStream.read();
                continue;
            }
            oneByte=fileInputStream.read();
        }

        writer.close();

    }
}
