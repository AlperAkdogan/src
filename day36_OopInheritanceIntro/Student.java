package day36_OopInheritanceIntro;

public class Student {

    public Student(int age, char gender, char grade, String schoolName, String name) {
        setName(name);
        setAge(age);
        setGrade(grade);
        setSchoolName(schoolName);
        setGender(gender);
    }


    public String toString() {
        return "Student{" +
                "age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    private int age;
    private char gender,grade;
    private  String schoolName, name;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age <5 || age >90){
            return;
        }
        this.age = age;
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M'|| gender == 'F')){
            return;
        }
        this.gender = gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B'||grade == 'C'|| grade == 'D' || grade =='F')){
            return;
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
/*
warmup tasks:
	1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()


Encapsulation: hiding the fileds by giving private access modifiers

			  use getter/setter to read/write the private data


			  Getter (Read Only): public instance method
			  					  Return type is not void
			  					  Return type must match with private instance variable' data type
			  					  Does not pass any parameter
			  					  Returns the private instance variables value
 */