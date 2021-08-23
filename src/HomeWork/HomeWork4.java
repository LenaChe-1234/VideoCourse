package HomeWork;

public class HomeWork4 {
}

class Student{
    int studentID;
    String  name;
    String surname;
    int yearOfEducation;
    double avgNoteMath;
    double avgNoteEconomic;
    double avgNoteLanguage;

}

class StudentTest{

    double avgNote (Student st){
        double avgNote = (st.avgNoteMath+ st.avgNoteEconomic+st.avgNoteEconomic)/3;
        System.out.println(" Srednia arifmeticheskaya studenta " + st.name + "  " +st.surname + " ravna " + avgNote);
        return avgNote;
    }
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentID = 1;
        student1.name = "Felix";
        student1.surname = "Tomtom";
        student1.yearOfEducation = 2020;
        student1.avgNoteMath = 7.0;
        student1.avgNoteEconomic = 8.6;
        student1.avgNoteLanguage = 7.1;

        student2.studentID = 1;
        student2.name = "Chrictoph";
        student2.surname = "Maxi";
        student2.yearOfEducation = 2020;
        student2.avgNoteMath = 8.8;
        student2.avgNoteEconomic = 9.9;
        student2.avgNoteLanguage = 9.8;

        student3.studentID = 3;
        student3.name = "Oskar";
        student3.surname = "Tomasic";
        student3.yearOfEducation = 2020;
        student3.avgNoteMath = 10.0;
        student3.avgNoteEconomic = 8.6;
        student3.avgNoteLanguage = 9.0;


       StudentTest studentTest = new StudentTest();
       studentTest.avgNote(student1);
       studentTest.avgNote(student2);
       studentTest.avgNote(student3);
    }
}
