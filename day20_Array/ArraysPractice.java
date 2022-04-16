package day20_Array;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        // store the elements: 10, 20, 50, 70,
        int[] numbers = {10, 20, 50, 70}; //size 4

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------");

        // create a veriable that can contain 5 scores

        int[] score = new int[5]; //[0, 0, 0, 0, 0]
        score[1]=85;
        score[score.length-1] = 95;
        score[3]= 75;
        score[0]= 65;
        score [2]=55;

        System.out.println(Arrays.toString(score)); //

        System.out.println("------------------------------------");

        String[]months= {"jan","feb","march","april","may","june","july","august","sep","oct","nov","dec"};

        System.out.println(Arrays.toString(months));


        for (int i = 0; i <months.length ; i++) {
            System.out.print(months[i]+" ");

        }

        for (int i = months.length-1 ; i >= 0; i--) {
            System.out.println(months[i]);

        }





    }
}
