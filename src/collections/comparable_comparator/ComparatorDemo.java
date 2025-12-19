package collections.comparable_comparator;

import java.util.*;

class Employee {
    int salary;
    Employee(int salary) {
        this.salary = salary;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(40000));
        list.add(new Employee(30000));

        Collections.sort(list, (e1, e2) -> e1.salary - e2.salary);

        for (Employee e : list) {
            System.out.println(e.salary);
        }
    }
}
