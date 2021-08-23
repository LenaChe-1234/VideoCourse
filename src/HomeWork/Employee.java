package HomeWork;

public class Employee {

    Employee (int id1, String surname1, int age1, double salary1, String department1){
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

    double doubleSalary (double salary){
        salary *=2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Felix", 35, 15000.00, "IT");
        Employee employee2 = new Employee(2, "TomTom", 40, 20500.50, "Counting");

        System.out.println(employee1.doubleSalary(employee1.salary));
        System.out.println(employee2.doubleSalary(employee2.salary));
    }
}
