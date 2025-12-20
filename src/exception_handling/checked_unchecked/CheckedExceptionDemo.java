package exception_handling.checked_unchecked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked exception occurred");
        }
    }
}
