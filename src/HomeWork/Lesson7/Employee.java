package HomeWork.Lesson7;

public class Employee {

    Employee (int id1, String surname1, int age1, double salary1, String department1){
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id2){
        id = id2;
    }

    Employee (String surname2){
        surname = surname2;
    }

    private Employee (double salary2){
        salary = salary2;
    }

    double doubleSalary (){
        salary *=2;
        return salary;
    }

    public void getId(){
        System.out.println("ID = " + id);
    }

    public void getSurname(){
        System.out.println("Surname is " + surname);
    }

    public void getSalary(){
        System.out.println("Salary = " +salary);
    }
}
