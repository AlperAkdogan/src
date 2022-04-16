package day22_MultiDimensionalArrayy;

public class iteratingMulti2 {

    public static void main(String[] args) {

        int[][] arr20 = {{1,2,3},{4,5,6},{7,8,9,10,11}};

        for (int i = arr20.length - 1; i >= 0; i--) {// index num of 1d arrays starting from last index to 0

            for (int j = 0; j < arr20[i].length; j++) {// j index number of elements from 0 to last index

                System.out.print(arr20[i][j]+" ");
            }
            System.out.println();
        }

    }
}
