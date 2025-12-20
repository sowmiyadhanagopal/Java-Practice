package exception_handling.try_with_resources;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("test.txt")) {
            System.out.println("File opened successfully");
        } catch (IOException e) {
            System.out.println("Exception handled");
        }
    }
}
