package Lesson8;

public class Student {

    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println(" Student № " + count + " was created");
    }

    public static void showCount(){
        System.out.println("Number of created STUDENTS " + count);
    }

    public void showInfo(){
        System.out.println("Welcome to the student class!!!");
    }

    void abc(){
        a++;
        count++;
    }

}

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Ivan", 1);
        System.out.println(Student.count);
        Student student2 = new Student("Petr", 4);
        Student student3 = new Student("Masha", 2);
        Student.showCount();
        student3.showCount();
    }
}