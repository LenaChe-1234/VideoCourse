package Lesson11;

public class Student {

    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    public static void changeName(Student s1){
        s1.name = "Kristof";
    }

    public static void main(String[] args) {

        Student st1 = new Student("Oskar", 3, 9.5);
        Student st2 = new Student("Ivan", 5, 8.9);

        swap(st1, st2);
        System.out.println("First student name " + st1.name);
        System.out.println("Second student name " + st2.name);

        changeName(st1);
        System.out.println(st1.name);
    }
}
