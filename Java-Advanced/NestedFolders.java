import java.io.*;
import java.util.ArrayDeque;

public class NestedFolders {
    public static void main(String[] args) throws IOException {

        String nameOfFile = "src/Files-and-Streams";

        File file = new File(nameOfFile);


        ArrayDeque<File> nameOfFiles=new ArrayDeque<>();
        nameOfFiles.offer(file);

        int count=1;
        while (!nameOfFiles.isEmpty()){
            File upperFile=nameOfFiles.poll();
            File[] nestedFiles = upperFile.listFiles();
            for (File file1 : nestedFiles) {
                if(file1.isDirectory()){
                    nameOfFiles.offer(file1);
                    count++;
                }
            }

            System.out.println(upperFile.getName());
        }
        System.out.println(count+" folders");


    }
}
