package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {


        String[] stundents = {"Alper", "SAMİ", "SEMA", "LEVENT","ASYA"};

        String[]diamonds = Arrays.copyOf(stundents, 3);

        System.out.println(Arrays.toString(diamonds));

        System.out.println("------------------------------------------------");


        char[]ch1= {'A','B','C','D','E','F','G','H','I'};
        char[]ch2= Arrays.copyOfRange(ch1, 2, 6+1);

        System.out.println(Arrays.toString(ch2));


        System.out.println("--------------------------------------------");

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        // index         0 1  2   3 4  5  6  7  8  9
        int[]result =Arrays.copyOfRange(scores, 3, 7+1);

        System.out.println(Arrays.toString(result));

        int[] result2= Arrays.copyOfRange(scores, 5, scores.length);

        System.out.println(Arrays.toString(result2));
    }
}
