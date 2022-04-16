package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {

    public static void main(String[] args) {


        // create a veriable that'S capable enough to contain 5 names
        String[] myGroup = new String[5];    // after name or after data type // size fixed [5]
        myGroup[0] = "Alper";
        myGroup[1] ="Hasan";
        myGroup[2] ="cihan";
        myGroup[3] ="enver";
        myGroup[4] ="cihat";
        //System.out.println(myGroup); // hasahcode
        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------------------");

       String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));

        int number =5;

        if (number<1 || number >7){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);


        System.out.println("------------------------------------------------------------------------------");

        String[]months= {"jan","feb","march","april","may","june","july","august","sep","oct","nov","dec"};

        System.out.println(Arrays.toString(months));

        int number1 = 7;

        if(number1<1 || number1>12){
            System.out.println("Invlalid");
            System.exit(0);
        }
        System.out.println(months[number1-1]);



    }
}
