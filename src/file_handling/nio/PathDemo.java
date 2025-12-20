package file_handling.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("sample.txt");
        System.out.println("File name: " + path.getFileName());
        System.out.println("Absolute path: " + path.toAbsolutePath());
    }
}

