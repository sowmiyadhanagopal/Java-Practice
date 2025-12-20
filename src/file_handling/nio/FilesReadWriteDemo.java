package file_handling.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class FilesReadWriteDemo {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("nio.txt");
            Files.write(path, "Hello NIO".getBytes());

            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("NIO error");
        }
    }
}
