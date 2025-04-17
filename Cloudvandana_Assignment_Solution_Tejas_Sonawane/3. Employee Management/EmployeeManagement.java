import java.util.ArrayList;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Tejas", 50000);
        Employee emp2 = new Employee(2, "Rahul", 55000);
        Employee emp3 = new Employee(3, "Sneha", 60000);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        for (Employee e : list) {
            e.displayDetails();
        }
    }
}
