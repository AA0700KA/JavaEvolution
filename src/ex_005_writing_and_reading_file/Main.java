package ex_005_writing_and_reading_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class Main {

    public static void main(String[] args) {
        String fileName = "test.txt";

        Path path = Path.of(fileName);

        try {
            Files.writeString(path, "testing write string into file", StandardOpenOption.APPEND);
            String temp = null;

            while ( (temp = Files.readString(path)) != null) {
                System.out.println(temp);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
