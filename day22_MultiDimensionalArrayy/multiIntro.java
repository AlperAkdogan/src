package day22_MultiDimensionalArrayy;

import java.util.Arrays;

public class multiIntro {

    public static void main(String[] args) {

        String[] group1 = {"Joy", "Jonah","Jamesson"};
        String[] group2 = {"Joy", "Jonah","Jamesson"};
        String[] group3 = {"Joy", "Jonah","Jamesson"};


        String[][]groups = new String[3][];

        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("-----------------------------");

        int[][] arr20 = {{1,2,3},{4,5,6},{7,8,9,0}};
        //             index 0      1        2


        System.out.println(Arrays.deepToString(arr20));

        System.out.println(Arrays.toString(arr20[1]));


        System.out.println(arr20[2][3]);


    }
}
