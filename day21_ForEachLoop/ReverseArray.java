package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {


        int[] numbers={10,20,30,40,50};

        int[]reversed= new int[numbers.length];// 50 40 30 20 10

        /*        j             i
        Reversed [0] = numbers [4]
        Reversed [1] = numbers [3]
        Reversed [2] = numbers [2]
        Reversed [3] = numbers [1]
        Reversed [4] = numbers [0]
         */


        for (int i = numbers.length - 1, j=0; i >= 0; i--,j++) { //yukarı bak j ler

            reversed[j] = numbers[i];
        }

        System.out.println(Arrays.toString(reversed));







    }
}
