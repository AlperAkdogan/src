package day4_Variables;

public class PrimitiviesIntro {

    public static void main(String[] args) {

        //age: 25 years old
        byte age = 38;

        // weight: 160 pounds
        // byte weight_ 160 // 160 is out of byte' range
        // byte num 129; // 160 is within the range of short

        short weight= 160; // 160 is within the range of short

        //salary: 100000 $
        //short sallary =100000; // 100000 is out of short' range
        int salary= 100_000; //

        long asset = 3_333_333_333L;

        //tax: 0.26

        float tax = 0.26F;

        double PI = 3.14;

        // #

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch4 =1500;
        System.out.println("ch4 = " + ch4);

        char gender = 'F';

        char grade = 'A';

        System.out.println("grade = " + grade);
        System.out.println("gender = " + gender);

        boolean isEmployeed = true;
        boolean isMarried = false;

        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);

        String name = "Alper Akdogan";
        String city = "Antalya";
        String country= "Turkey";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("country = " + country);




    }
}
