package oops;

class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}
public class ClassandObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sowmiya";
        s1.age = 22;
        s1.display();
    }
}
