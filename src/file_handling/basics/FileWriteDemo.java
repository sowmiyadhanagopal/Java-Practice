package file_handling.basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is file handling in Java");
            writer.close();
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
