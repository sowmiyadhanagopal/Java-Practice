package file_handling.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"));
            bw.write("Buffered Writer example");
            bw.newLine();
            bw.write("Fast writing");
            bw.close();
            System.out.println("Buffered write done");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
