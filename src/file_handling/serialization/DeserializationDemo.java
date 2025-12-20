package file_handling.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("student.ser"));
            Student s = (Student) ois.readObject();
            ois.close();
            System.out.println(s.id + " " + s.name);
        } catch (Exception e) {
            System.out.println("Deserialization error");
        }
    }
}
