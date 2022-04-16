package day22_MultiDimensionalArrayy;

import java.util.Arrays;

public class forEachLoop {

    public static void main(String[] args) {

        int[][] arr20 = {{1,2,3},{4,5,6},{7,8,9,10,11}};

        for (int[] each1dArray : arr20){
            //System.out.println(Arrays.toString(each1dArray));
            for (int eachElement : each1dArray){
                System.out.println(eachElement);
            }
        }

        for (int[] each1dArray : arr20) {
            for (int EachElement : each1dArray) {
                System.out.println(EachElement);
            }
        }
    }
}
