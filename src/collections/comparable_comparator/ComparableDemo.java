package collections.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int age;

    Student(int age) {
        this.age = age;
    }

    public int compareTo(Student s) {
        return this.age - s.age;
    }

    public String toString() {
        return String.valueOf(age);
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(22));
        list.add(new Student(18));

        Collections.sort(list);
        System.out.println(list);
    }
}
