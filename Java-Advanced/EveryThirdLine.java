import java.io.*;

public class EveryThirdLine {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/input.txt")));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/output.txt")));

        String input=reader.readLine();
        int count=0;
        while (input!=null){
            count++;

            if(count%3==0){
                writer.write(input);
                writer.write(System.lineSeparator());
            }

            input=reader.readLine();
        }

        writer.close();

    }
}
