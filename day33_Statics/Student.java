package day33_Statics;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;


    public Student(String name, char gender, int age, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
