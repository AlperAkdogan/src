package day35_Encapsulation.encapsulation;

import javax.print.DocFlavor;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        this.name = name;
        setGender(gender); // is it valid or not // conditions
        setAge(age);  // is it valid or not   Conditions
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender =='M'|| gender == 'F')){
            return;
        }
        this.gender= gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <16 || age > 90){
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
