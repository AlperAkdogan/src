package day15ForLoop;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int max = -2147483647; // any user entered number will be greater than <

        for (int i =0; i<5; i++){
            System.out.println("Enter a number");

            int num = scan.nextInt();

            if (num>max){   // if the user entered number is greater than current maximum number
                max=num;
            }
        }

        System.out.println("max= "+max);
    }
}
