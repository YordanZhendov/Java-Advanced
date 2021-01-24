import java.io.*;

public class ListOfFiles {
    public static void main(String[] args) throws IOException {

        String nameOfFile="src/Files-and-Streams";

        File file=new File(nameOfFile);
        File[] files = file.listFiles();


        for (File file1 : files) {
            if(!file1.isDirectory()){
                System.out.printf("%s: [%d]%n",file1.getName(),file1.length());
            }
        }


    }
}
