package file_handling.streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("stream.txt");
            String text = "Writing using FileOutputStream";
            fos.write(text.getBytes());
            fos.close();
            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
