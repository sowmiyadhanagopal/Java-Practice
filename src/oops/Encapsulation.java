package oops;

class Employee {
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(40000);
        System.out.println(emp.getSalary());
    }
}
