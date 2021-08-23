package HomeWork;

public class StudentLesson6 {
    StudentLesson6(){

    }

    StudentLesson6(int stID, String stName, String stSurname, int edYear,
                   double avgNoteM, double avgNoteE,double avgNoteL){
        studentID = stID;
        name = stName;
        surname = stSurname;
        yearOfEducation = edYear;
        avgNoteMath = avgNoteM;
        avgNoteEconomic = avgNoteE;
        avgNoteLanguage = avgNoteL;

    }

    StudentLesson6(int stId, String stName, String stSurname, int edYear){
        this(stId, stName, stSurname, edYear, 0.0,0.0, 0.0);
    }

    int studentID;
    String  name;
    String surname;
    int yearOfEducation;
    double avgNoteMath;
    double avgNoteEconomic;
    double avgNoteLanguage;
}

class StudentLesson6Test{

    double avgNote (StudentLesson6 st){
        double avgNote = (st.avgNoteMath+ st.avgNoteEconomic+st.avgNoteEconomic)/3;
        System.out.println(" Srednia arifmeticheskaya studenta " + st.name + "  " +st.surname + " ravna " + avgNote);
        return avgNote;
    }

    public static void main(String[] args) {

        StudentLesson6 stud1 = new StudentLesson6(1, "Felix", "Tj", 2021, 10.0, 9.5, 9.7);
        System.out.println("Information about student " + stud1.studentID+ "  Name " +stud1.name + " " + stud1.surname);
        System.out.println("Notes math " + stud1.avgNoteMath);
        System.out.println("Notes economic " + stud1.avgNoteEconomic);
        System.out.println("Notes Language " + stud1.avgNoteLanguage);

        StudentLesson6 stud2 = new StudentLesson6(2, "Oskar", "Tomash", 2020);
        stud2.avgNoteLanguage = 10;
        stud2.avgNoteEconomic = 9.9;
        stud2.avgNoteMath = 10.0;
        System.out.println("Information about student " + stud2.studentID+ "  Name " +stud2.name + " " + stud2.surname);
        System.out.println("Notes math " + stud2.avgNoteMath);
        System.out.println("Notes economic " + stud2.avgNoteEconomic);
        System.out.println("Notes Language " + stud2.avgNoteLanguage);

        StudentLesson6 stud3 = new StudentLesson6();
        stud3.avgNoteMath = 1;
        stud3.avgNoteEconomic = 5;
        stud3.avgNoteLanguage = 3;
        System.out.println("Information about student " + stud3.studentID+ "  Name " +stud3.name + " " + stud3.surname);
        System.out.println("Notes math " + stud3.avgNoteMath);
        System.out.println("Notes economic " + stud3.avgNoteEconomic);
        System.out.println("Notes Language " + stud3.avgNoteLanguage);

        StudentLesson6Test studentTest = new StudentLesson6Test();
        studentTest.avgNote(stud1);
        studentTest.avgNote(stud2);
        studentTest.avgNote(stud3);
    }
}