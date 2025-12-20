package file_handling.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            Student s = new Student(1, "Sowmiya");
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("student.ser"));
            oos.writeObject(s);
            oos.close();
            System.out.println("Object serialized");
        } catch (Exception e) {
            System.out.println("Serialization error");
        }
    }
}
