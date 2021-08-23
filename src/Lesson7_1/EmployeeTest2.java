package Lesson7_1;

import HomeWork.Lesson7.Employee;

public class EmployeeTest2 {

    public static void main(String[] args) {

        Employee emp1 = new Employee(5);
//        Employee emp2 = new Employee("Ivanov");
//        Employee emp3 = new Employee(555.5);

      //  System.out.println(emp1.id);
        System.out.println(emp1.surname);
      //  System.out.println(emp1.salary);

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();
    }
}
