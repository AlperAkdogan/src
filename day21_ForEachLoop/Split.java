package day21_ForEachLoop;

import java.util.Arrays;

public class Split {

    public static void main(String[] args) {


        String sentence = "Wooden Spoon";

        String[] words= sentence.split(" ");

        System.out.println(Arrays.toString(words));


        System.out.println("--------------------------------------");

        String email="WoodenSpoon@cydeo.com";

        String[] e =email.split("@");

        System.out.println(Arrays.toString(e));


        System.out.println("---------------------------------------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String[] sentences = s.split("\\. ");

        System.out.println(Arrays.toString(sentences));
    }
}
