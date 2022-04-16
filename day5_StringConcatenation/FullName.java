package day5_StringConcatenation;



public class FullName {

    public static void main(String[] args) {

        String name ="Alper";
        String Surname ="Akdogan";
        String Fullname= name + " "+  Surname;
        int age= 25;
        String jobtitle= "SDET";
        String companyName ="Apple Inc";
        double salary= 10000.56;

        System.out.println("Full name of the person is "+Fullname);

        System.out.println(Fullname + " " + "is" + " " + age + " " + "years old");
        System.out.println(Fullname + " is" + " " + age + " years old"); // daha kolay

        System.out.println(Fullname+ " is" + " "+ jobtitle + ", works at "+ companyName + ", and " + Fullname +"'s "+ "salary is "+salary );

    }
}
