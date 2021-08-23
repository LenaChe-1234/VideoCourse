package Lesson7;

public class Employee {

     double selary;

    void dvoynayaZP (){
        System.out.println("Novayz  z/p = " + selary*2);
    }

     Employee (double selary2){
        selary = selary2;
    }

     static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.selary);
        emp.dvoynayaZP();
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(400);
        System.out.println(emp.selary);
        emp.dvoynayaZP();
    }
}
