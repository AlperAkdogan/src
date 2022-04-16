package day4_Variables;

import org.w3c.dom.ls.LSOutput;

public class EmployeeInfo {

    public static void main(String[] args) {
        /*
        variable naming rules:
		1. MUST be unique
		2. camelCase
		3. Can Not start with digits
		4. starts with lower case letters
		5. Can Not be Java Reserved words
		6. Can Not have special characters other than _ and $
		7. readable, understandable
         */


    String name = "Alper";
    int age = 25;
    char gender= 'M';
    String company="Amazon";
    String jobTitle="IT";
                                                            // veriable names $ _  sayıyla başlamaz
    double yearsOfExperience = 2.5;
    int salary = 10000;
    boolean isfulltime = true;
    boolean isMarried = false;
    String employeeID ="A234513";
    String SSN = "(123)-45-6789";

        System.out.println("name = " + name);
        System.out.println("employeeID = " + employeeID);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isfulltime = " + isfulltime);
        System.out.println("salary = " + salary);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("company = " + company);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        

}









}
