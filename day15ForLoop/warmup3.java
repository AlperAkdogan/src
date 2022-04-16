package day15ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class warmup3 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first and last names");
        String first = scan.nextLine();
        String last = scan.nextLine();

        first=first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();//if it is char you cant use string
        //(""+ first.charAt(0) ) . toUpperCase() +    ""       ""         "" "" OPSİYON

       last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println(first+" "+last);;
    }
}
/*

	3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */