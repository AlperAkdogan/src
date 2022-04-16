package day33_Statics;

import java.util.Arrays;

public class studentObject {

    public static void main(String[] args) {


        Student student1 = new Student("Alper",'M',25,2813134,'A');

        System.out.println(student1);

        Student student2 = new Student("Hasan",'M',25,11345123,'A');

        Student student3= new Student("Enver", 'M',25,123123123,'B');

        Student student4= new Student("Abdurrahman", 'F',25,133131,'D');

        Student[] students = {student1,student2,student3,student4};

        System.out.println(Arrays.toString(students));
    }
}
